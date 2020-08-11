package com.mt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mt.bean.UmsAdmin;
import com.mt.bean.UmsPermission;
import com.mt.bean.UmsResource;
import com.mt.bean.UmsRole;

import java.util.List;

/**
 * Created by 郭俊旺 on 2020/8/7 9:37
 *
 * @author 郭俊旺
 */
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {

    /**获取用户的权限*/
    public List<UmsPermission> getPermissions(Long userId);
    /**获取用户的资源*/
    public List<UmsResource> getResource(Long userId);

    /**获取用户的角色*/
    List<UmsRole> getRoles(Long adminId);
}
