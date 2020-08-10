package com.mt.controller;

import cn.hutool.core.util.StrUtil;
import com.mt.api.CommonResult;
import com.mt.dto.UmsAdminLoginParam;
import com.mt.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @Value("${security.token-header-name}")
    private String tokenHeaderName;

    @GetMapping("/productAttribute/1")
    public Object test(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        return authorities;
    }

    @PostMapping("/login")
    public CommonResult login(@RequestBody UmsAdminLoginParam loginParam){

        String token = umsAdminService.login(loginParam.getUsername(), loginParam.getPassword());

        if(StrUtil.isBlank(token)){
            return CommonResult.failed("用户名或密码错误!");
        }

        Map<String,Object> resultMap  =new HashMap<>();
        resultMap.put("token",token);
        resultMap.put("tokenHeader",tokenHeaderName);

        return CommonResult.success(resultMap);
    }

}
