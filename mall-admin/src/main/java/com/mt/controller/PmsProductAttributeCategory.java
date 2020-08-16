package com.mt.controller;

import com.mt.api.CommonResult;
import com.mt.dto.PmsProductAttributeCategoryItem;
import com.mt.service.PmsProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("productAttribute/category")
public class PmsProductAttributeCategory {
    @Autowired
    private PmsProductAttributeCategoryService pacService;

    @GetMapping("/list/withAttr")
    public CommonResult listWithAttr(){
        List<PmsProductAttributeCategoryItem> listWithAttr = pacService.getListWithAttr();
        return CommonResult.success(listWithAttr);
    }

}
