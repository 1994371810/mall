package com.mt.config.security;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mt.bean.UmsResource;
import com.mt.dynamic.DynamicSecurityService;
import com.mt.mapper.UmsResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.stereotype.Service;

import java.sql.Struct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 郭俊旺 on 2020/8/10 9:24
 * 为了实现动态的对路径进行权限校验 需要实现 DynamicSecurityService 接口
 * @author 郭俊旺
 */

@Service("dynamicSecurityService")//注意名称必须为 dynamicSecurityService
public class DynamicSecurityServiceImpl implements DynamicSecurityService {
    @Autowired
    private UmsResourceMapper umsResourceMapper;

    @Override
    public Map<String, ConfigAttribute> loadDataSource() {

        List<UmsResource> resources = umsResourceMapper.selectList(new QueryWrapper<>());

        Map<String,ConfigAttribute> result = new ConcurrentHashMap<>();

        //key为路径 value 为 需要的权限
        resources.stream()
                .filter( o -> StrUtil.isNotBlank(o.getName())&& o.getId()!=null)
                .forEach( o -> {
                    result.put(o.getUrl(),new SecurityConfig(o.getId()+":"+o.getName()));
                });


        return result;
    }


}
