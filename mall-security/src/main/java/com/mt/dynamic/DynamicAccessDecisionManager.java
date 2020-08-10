package com.mt.dynamic;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by 郭俊旺 on 2020/8/6 17:52
 *
 * @author 郭俊旺
 */
public class DynamicAccessDecisionManager implements AccessDecisionManager {


    @Override
    public void decide(Authentication authentication, Object o,
                       Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        //这里的 collection 就是 DynamicSecurityMetadataSoruce里面返回的
        //authentication 就是用户拥有的权限 adminUserDetails.getAuthorities 方法返回的结果

        //如果访问的接口在数据库内没有匹配到 则不需要权限 放行
        if(collection == null || collection.isEmpty()){
            return;
        }

        for(ConfigAttribute attr : collection){
            for (GrantedAuthority authority : authentication.getAuthorities()) {
                if(authentication.getAuthorities().equals(attr.getAttribute())){
                    //如果匹配上了则放行
                    return ;
                }
            }
        }
        //如果没有匹配到 则证明该用户没有数据库中配置的路径需要的权限
        //抛异常直接走认证失败的处理 RestfulAccessDeniedHandler
        throw new AccessDeniedException("抱歉，您没有访问权限");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }


}
