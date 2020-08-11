package com.mt.controller;

import cn.hutool.core.util.StrUtil;
import com.mt.api.CommonResult;
import com.mt.bean.UmsAdmin;
import com.mt.bean.UmsMenu;
import com.mt.bean.UmsRole;
import com.mt.dto.UmsAdminLoginParam;
import com.mt.service.UmsAdminService;
import com.mt.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService adminService;

    @Autowired
    private UmsRoleService umsRoleService;

    @GetMapping("/productAttribute/1")
    public Object test(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        return authorities;
    }

    @PostMapping("/login")
    public CommonResult login(@RequestBody @Validated UmsAdminLoginParam loginParam, BindingResult bindingResult){

        String token = adminService.login(loginParam.getUsername(), loginParam.getPassword());

        if(StrUtil.isBlank(token)){
            return CommonResult.failed("用户名或密码错误!");
        }

        Map<String,Object> resultMap  =new HashMap<>();
        resultMap.put("token",token);
        resultMap.put("tokenHead","");

        return CommonResult.success(resultMap);
    }

    @GetMapping("/info")
    public CommonResult info(Principal principal){
        //Principal springSecurity会自动注入
        //用于获取登陆用户的用户信息 如果没登陆则为空

        if(principal==null){
            return CommonResult.unauthorized(null);
        }
        Map<String,Object> result = new HashMap();

        //获取用户名
        String username = principal.getName();
        //获取用户信息
        UmsAdmin admin = adminService.findUserByUserName(username);

        //获取用户拥有的菜单
        List<UmsMenu> menuList = umsRoleService.getMenuList(admin.getId());

        //获取用户的角色
        Set<String> roleNames = adminService.getRoleList(admin.getId()).stream()
                .map(UmsRole::getName)
                .collect(Collectors.toSet());


        result.put("username",username);
        result.put("menus",menuList);
        result.put("icon",admin.getIcon());
        result.put("roles",roleNames);

        return CommonResult.success(result);
    }

}
