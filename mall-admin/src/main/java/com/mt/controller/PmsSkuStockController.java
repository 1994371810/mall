package com.mt.controller;

import com.mt.api.CommonResult;
import com.mt.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sku")
public class PmsSkuStockController {
    @Autowired
    private PmsSkuStockService skuStockService;

    @GetMapping("{pid}")
    public CommonResult getList(@PathVariable Long pid,String keyword){
        return CommonResult.success(skuStockService.getList(pid,keyword));
    }
}
