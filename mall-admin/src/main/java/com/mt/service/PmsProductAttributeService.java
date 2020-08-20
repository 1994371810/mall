package com.mt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.mt.bean.PmsProductAttribute;
import com.mt.bean.PmsProductCategory;
import com.mt.bean.PmsProductCategoryAttributeRelation;
import com.mt.dao.PmsProductAttributeDao;
import com.mt.dto.ProductAttrInfo;
import com.mt.mapper.PmsProductAttributeMapper;
import com.mt.mapper.PmsProductCategoryAttributeRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductAttributeService {
    @Autowired
    private PmsProductAttributeDao attributeDao;

    public List<ProductAttrInfo> getProductCategoryAttributes(Integer categoryId) {
       return  attributeDao.selectByProductCategoryId(categoryId);
    }


    /**
     * 通过分类id获取商品参数列表
     * @param categoryId 类别id
     * @return {@link List<PmsProductAttribute>}
     */
    public List<PmsProductAttribute> getAttributeByCategoryId(Long categoryId, Integer type, Integer pageNum,Integer pageSize) {
        QueryWrapper qw = new QueryWrapper();
        qw.eq("product_attribute_category_id",categoryId);
        qw.eq("type",type);

        PageHelper.startPage(pageNum,pageSize);
        return attributeDao.selectList(qw);
    }
}
