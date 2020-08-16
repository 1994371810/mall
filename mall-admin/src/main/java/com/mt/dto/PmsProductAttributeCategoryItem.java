package com.mt.dto;

import com.mt.bean.PmsProductAttribute;
import com.mt.bean.PmsProductAttributeCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * Created by macro on 2018/5/24.
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
   /*商品属性列表*/
    private List<PmsProductAttribute> productAttributeList;
}
