package com.mt.controller;

import com.mt.api.CommonResult;
import com.mt.bean.PmsProductCategory;
import com.mt.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 郭俊旺 on 2020/8/11 14:22
 * 产品分类管理
 * @author 郭俊旺
 */
@RestController
@RequestMapping("/productCategory")

public class PmsProductCategoryController {
    @Autowired
    private PmsProductCategoryService categoryService;

    /**查询所有以及分类及其子分类信息*/
    @GetMapping("/list/withChildren")
    public CommonResult listWithChildren(){
        List<PmsProductCategory> categoryList = categoryService.listWithChildren();
        return CommonResult.success(categoryList);
    }




}
