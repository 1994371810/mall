package com.mt.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mt.bean.UmsMenu;
import com.mt.bean.UmsRole;

import java.util.List;

/**
 * 后台用户角色表(UmsRole)表数据库访问层
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
public interface UmsRoleMapper extends BaseMapper<UmsRole> {

    /**
     * 获取用户id获取用户所拥有的菜单
     * */
    List<UmsMenu> selectMenu(Long adminId);

}