package com.mt.service;

import com.mt.bean.PmsProductCategory;
import com.mt.mapper.PmsProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 郭俊旺 on 2020/8/11 14:35
 *
 * @author 郭俊旺
 */
@Service
public class PmsProductCategoryService {
    @Autowired
    private PmsProductCategoryMapper categoryMapper;


    /**
     * 获取所有一级分类及其子分类
     * @return {@link List<PmsProductCategory>}
     */
    public List<PmsProductCategory> listWithChildren() {
       return  categoryMapper.listWithChildren();
    }
}
