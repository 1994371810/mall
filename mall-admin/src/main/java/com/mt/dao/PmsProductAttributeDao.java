package com.mt.dao;

import com.mt.dto.ProductAttrInfo;
import com.mt.mapper.PmsProductAttributeMapper;

import java.util.List;

public interface PmsProductAttributeDao extends PmsProductAttributeMapper {


    List<ProductAttrInfo> selectByProductCategoryId(Integer productCategoryId);
}
