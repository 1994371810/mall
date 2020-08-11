package com.mt.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mt.bean.PmsProductCategory;

import java.util.List;

/**
 * 产品分类(PmsProductCategory)表数据库访问层
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
public interface PmsProductCategoryMapper extends BaseMapper<PmsProductCategory> {

    List<PmsProductCategory> listWithChildren();
}