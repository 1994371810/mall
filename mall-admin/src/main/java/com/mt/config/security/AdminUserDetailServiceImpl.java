package com.mt.config.security;

import com.mt.bean.UmsAdmin;
import com.mt.bean.UmsPermission;
import com.mt.bean.UmsResource;
import com.mt.details.AdminUserDetailsService;
import com.mt.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserDetailServiceImpl implements AdminUserDetailsService {
    @Autowired
    private UmsAdminService umsAdminService;

    /***加缓存*/
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername==>");

        UmsAdmin umsAdmin = umsAdminService.findUserByUserName(username);
         if(umsAdmin==null){
             throw new UsernameNotFoundException("用户不存在");
         }

        List<UmsResource> userResource = umsAdminService.getUserResource(umsAdmin.getId());
        List<UmsPermission> userPermission = umsAdminService.getUserPermission(umsAdmin.getId());


        return new AdminUserDetail(umsAdmin,userResource,userPermission);
    }


}
