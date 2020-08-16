package com.mt.controller;

import com.mt.api.CommonResult;
import com.mt.dto.ProductAttrInfo;
import com.mt.service.PmsProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("productAttribute")
public class PmsProductAttributeController {

    @Autowired
    private PmsProductAttributeService attributeService;

//    @GetMapping("/list/{cid}")
//    public CommonResult list(){
//
//    }

    @GetMapping("/attrInfo/{categoryId}")
    public CommonResult getAttributeByPCId(@PathVariable Integer categoryId){
        List<ProductAttrInfo> attribute = attributeService.getProductCategoryAttributes(categoryId);
        return CommonResult.success(attribute);
    }
}
