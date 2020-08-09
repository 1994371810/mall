package com.mt.controller;

import com.mt.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {
    @Autowired
    private UmsAdminService umsAdminService;

    @GetMapping("/a")
    @PreAuthorize("hasAuthority('3:商品属性管理2')")
    public Object test(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        return authorities;
    }

    @GetMapping("/login")
    public String login(String username ,String password){
        return umsAdminService.login(username,password);
    }
}
