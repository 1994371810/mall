package com.mt.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mt.bean.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）(PmsProductCategoryAttributeRelation)表数据库访问层
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
public interface PmsProductCategoryAttributeRelationMapper extends BaseMapper<PmsProductCategoryAttributeRelation> {

    /**批量插入*/
    int BatchInsert(@Param("list") List<PmsProductCategoryAttributeRelation> relations);
}