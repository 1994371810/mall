package com.mt.controller;

import cn.hutool.db.PageResult;
import com.mt.api.CommonPage;
import com.mt.api.CommonResult;
import com.mt.bean.PmsProductCategory;
import com.mt.dto.PmsProductAttributeParam;
import com.mt.dto.PmsProductCategoryParam;
import com.mt.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/list/{parentId}")
    public CommonResult getList(@PathVariable Integer parentId, @RequestParam(required = false,defaultValue = "1")Integer pageNum, @RequestParam(required = false,defaultValue = "5")Integer pageSize){
        List<PmsProductCategory> category = categoryService.getByParentId(parentId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(category));
    }
    @GetMapping("{id}")
    public CommonResult productInfo(@PathVariable Integer id){
        PmsProductCategory info = categoryService.getInfo(id);
        return CommonResult.success(info);
    }

    /**修改商品分类*/
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id,
                               @Validated
                               @RequestBody PmsProductCategoryParam productCategoryParam,
                               BindingResult result){
        int updateCount = categoryService.update(id, productCategoryParam);

        return updateCount>0? CommonResult.success(updateCount) : CommonResult.failed();
    }


}
