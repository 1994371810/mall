package com.mt.controller;

import com.mt.api.CommonPage;
import com.mt.api.CommonResult;
import com.mt.bean.PmsProductAttributeCategory;
import com.mt.dto.PmsProductAttributeCategoryItem;
import com.mt.service.PmsProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.ref.ReferenceQueue;
import java.util.List;

@RestController
@RequestMapping("productAttribute/category")
public class PmsProductAttributeCategoryController {
    @Autowired
    private PmsProductAttributeCategoryService pacService;

    @GetMapping("/list/withAttr")
    public CommonResult listWithAttr(){
        List<PmsProductAttributeCategoryItem> listWithAttr = pacService.getListWithAttr();
        return CommonResult.success(listWithAttr);
    }


    /**分页查询商品属性分类*/
    @GetMapping("/list")
    public CommonResult list(@RequestParam(required = false,defaultValue = "1")Integer pageNum, @RequestParam(required = false,defaultValue = "5")Integer pageSize){
        List<PmsProductAttributeCategory> list = pacService.getList(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
