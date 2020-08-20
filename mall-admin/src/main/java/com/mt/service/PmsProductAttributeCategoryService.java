package com.mt.service;

import com.github.pagehelper.PageHelper;
import com.mt.bean.PmsProductAttributeCategory;
import com.mt.controller.PmsProductAttributeCategoryController;
import com.mt.dao.PmsProductAttributeCategoryDao;
import com.mt.dto.PmsProductAttributeCategoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductAttributeCategoryService {

    @Autowired
    private PmsProductAttributeCategoryDao pacDao;


    /**
     * 分页查询所有商品参数分类
     * @param pageNum  当前页数
     * @param pageSize 分页大小
     */
    public  List<PmsProductAttributeCategory> getList(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        return pacDao.selectList(null);
    }

    /**
     * 查询所有商品 参数分类 和分类详情
     * @return {@link List< PmsProductAttributeCategoryController >}
     */
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return pacDao.selectWithAttr();
    }



}
