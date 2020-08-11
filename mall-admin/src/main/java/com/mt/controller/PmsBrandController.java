package com.mt.controller;


import com.mt.api.CommonPage;
import com.mt.api.CommonResult;
import com.mt.bean.PmsBrand;
import com.mt.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌功能Controller
 * Created by macro on 2018/4/26.
 * 商品品牌管理
 */
@RestController
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService brandService;

    @GetMapping("/list")
    public CommonResult getList(@RequestParam(value = "keyword", required = false) String keyword,
                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<PmsBrand> list = brandService.getList(keyword, pageNum, pageSize);

        return CommonResult.success(CommonPage.restPage(list));
    }
}
