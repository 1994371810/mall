package com.mt.service;

import com.mt.bean.UmsMenu;
import com.mt.mapper.UmsRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 郭俊旺 on 2020/8/11 11:40
 *
 * @author 郭俊旺
 */
@Service
public class UmsRoleService {
    @Autowired
    private UmsRoleMapper umsRoleMapper;


    /**
     * 获取用户id获取用户所拥有的菜单
     * */
    public List<UmsMenu> getMenuList(Long userId){
        return umsRoleMapper.selectMenu(userId);
    };

}
