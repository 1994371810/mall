package com.mt.controller;

import com.mt.api.CommonPage;
import com.mt.api.CommonResult;
import com.mt.bean.PmsProductAttribute;
import com.mt.dto.ProductAttrInfo;
import com.mt.service.PmsProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**通过分类id获取商品参数详情*/
    @GetMapping("/list/{categoryId}")
    public CommonResult list(@PathVariable Long categoryId , Integer type,@RequestParam(required = false,defaultValue = "1")Integer pageNum,@RequestParam(required = false,defaultValue = "1")Integer pageSize){
        List<PmsProductAttribute> attributeList = attributeService.getAttributeByCategoryId(categoryId,type, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(attributeList));
    }
}
