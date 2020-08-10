package com.mt.config;

import com.mt.details.AdminUserDetailsService;
import com.mt.dynamic.DynamicAccessDecisionManager;
import com.mt.dynamic.DynamicSecurityFilter;
import com.mt.dynamic.DynamicSecurityMetadataSource;
import com.mt.dynamic.DynamicSecurityService;
import com.mt.exception.RestAuthenticationEntryPoint;
import com.mt.exception.RestfulAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.Arrays;

/**
 * Created by 郭俊旺 on 2020/8/7 10:22
 *
 * @author 郭俊旺
 */
@Configuration
//允许通过注解的方式控制权限
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@EnableConfigurationProperties({SecurityPropertiesConfig.class})
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private AdminUserDetailsService userDetailsService;
    @Autowired
    private SecurityPropertiesConfig ignorePathConfig;

    @Autowired
    private JwtTokenFilter jwtTokenFilter;

    @Autowired
    private RestAuthenticationEntryPoint  restAuthenticationEntryPoint;

    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;

    @Autowired(required = false)
    private DynamicSecurityService dynamicSecurityService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //允许访问 的地址
        String[] allowAccessPath = ignorePathConfig.getIgnoreUrl().toArray(new String[ignorePathConfig.getIgnoreUrl().size()]);
        System.out.println("===>"+ Arrays.toString(allowAccessPath));
        http.csrf().disable().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeRequests()
                .antMatchers(allowAccessPath).permitAll()//允许配置的请求访问
                .antMatchers(HttpMethod.OPTIONS).permitAll()//允许跨域验证请求访问
                .anyRequest().authenticated();

        http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);

        http.exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler)
                .authenticationEntryPoint(restAuthenticationEntryPoint);


        if(dynamicSecurityService!=null){
            http.addFilterBefore(dynamicSecurityFilter(),FilterSecurityInterceptor.class);
        }


    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }



    //为了动态权限验证  当注入了 dynamicSecurityService 才执行
    @ConditionalOnBean(name = "dynamicSecurityService")
    @Bean
    public DynamicAccessDecisionManager dynamicAccessDecisionManager() {
        return new DynamicAccessDecisionManager();
    }


    @ConditionalOnBean(name = "dynamicSecurityService")
    @Bean
    public DynamicSecurityFilter dynamicSecurityFilter() {
        return new DynamicSecurityFilter();
    }

    @ConditionalOnBean(name = "dynamicSecurityService")
    @Bean
    public DynamicSecurityMetadataSource dynamicSecurityMetadataSource() {
        return new DynamicSecurityMetadataSource();
    }


}
