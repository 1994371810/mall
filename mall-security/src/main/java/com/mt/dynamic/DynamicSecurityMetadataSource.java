package com.mt.dynamic;

import cn.hutool.core.util.URLUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by 郭俊旺 on 2020/8/6 17:13
 *
 * @author 郭俊旺
 */
public class DynamicSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {


    private static Map<String, ConfigAttribute> configAttributeMap = null;

    @Autowired
    private DynamicSecurityService dynamicSecurityService;

    //从数据库中加载数据
    @PostConstruct
    private void loadDataSource(){
        configAttributeMap = dynamicSecurityService.loadDataSource();
    }

    /**
     * 清除数据缓存 一般是当数据库表内的权限发生改变时需要重新加载数据库信息时加载
     * */
    public void clear(){
        DynamicSecurityMetadataSource.configAttributeMap.clear();
        DynamicSecurityMetadataSource.configAttributeMap = null;
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {

        if(configAttributeMap == null){
            this.loadDataSource();
        }
        List<ConfigAttribute> configAttributes = new ArrayList<>();

        //获取当前访问的controller路径
        String requestUrl = ((FilterInvocation) o).getRequestUrl();

        String path = URLUtil.getPath(requestUrl);

        Set<Map.Entry<String, ConfigAttribute>> entries = configAttributeMap.entrySet();

        AntPathMatcher matcher = new AntPathMatcher();

        for(Map.Entry<String, ConfigAttribute> entry : entries){
            //从数据库获取访问路径pattern
            String pattern = entry.getKey();
            ConfigAttribute configAttribute = entry.getValue();

            //将当前访问路径与数据库配置的路径配对如果配对得上说明这个访问路径需要权限访问
            if(matcher.match(pattern,path)){
                configAttributes.add( configAttribute );
            }

        }
        return configAttributes;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

}
