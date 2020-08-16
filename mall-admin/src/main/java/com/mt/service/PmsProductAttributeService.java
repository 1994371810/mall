package com.mt.service;

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


}
