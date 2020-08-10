package com.mt.dynamic;

import com.mt.config.SecurityPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 郭俊旺 on 2020/8/6 18:17
 *
 * @author 郭俊旺
 */
public class DynamicSecurityFilter extends AbstractSecurityInterceptor implements Filter {
    @Autowired
    private DynamicSecurityMetadataSource securityMetadataSource;
    @Autowired
    private SecurityPropertiesConfig securityAllowPath;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request  = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        FilterInvocation filterInvocation = new FilterInvocation(request,response,filterChain);
        //如果是 options 请求直接放行
        if(request.getMethod().equals(HttpMethod.OPTIONS.name())){
            filterInvocation.getChain().doFilter(request,response);
            return;
        }
        //如果是配置了允许访问的 放行
        PathMatcher pathMatcher = new AntPathMatcher();
        for(String pattern : securityAllowPath.getIgnoreUrl()){
            if(pathMatcher.match(pattern,request.getRequestURI())){
                filterInvocation.getChain().doFilter(request,response);
                return;
            }
        }

        //其他的请求全部需要通过DynamicAccessDecisionManager 方法验证

        //此处会调用AccessDecisionManager中的decide方法进行鉴权操作
        InterceptorStatusToken token = super.beforeInvocation(filterInvocation);
        try {
            filterInvocation.getChain().doFilter(request, response);
        } finally {
            super.afterInvocation(token, null);
        }

    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return securityMetadataSource;
    }

    //必须写此方法,指定 我们自定义的 AccessDecisionManage
    @Autowired
    public void setMyAccessDecisionManager(DynamicAccessDecisionManager dynamicAccessDecisionManager) {
        super.setAccessDecisionManager(dynamicAccessDecisionManager);
    }
}
