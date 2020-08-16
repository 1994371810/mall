package com.mt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mt.bean.PmsProduct;
import com.mt.controller.PmsProductAttributeCategory;
import com.mt.dao.PmsProductAttributeCategoryDao;
import com.mt.dto.PmsProductAttributeCategoryItem;
import com.mt.mapper.PmsProductAttributeCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductAttributeCategoryService {

    @Autowired
    private PmsProductAttributeCategoryDao pacDao;

    /**
     * 查询所有商品 参数分类 和分类详情
     * @return {@link List<PmsProductAttributeCategory>}
     */
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return pacDao.selectWithAttr();
    }



}
