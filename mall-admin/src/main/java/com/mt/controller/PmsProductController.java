package com.mt.controller;

import com.mt.api.CommonPage;
import com.mt.api.CommonResult;
import com.mt.bean.PmsProduct;
import com.mt.dto.PmsProductQueryParam;
import com.mt.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by 郭俊旺 on 2020/8/11 19:14
 * 商品接口
 * @author 郭俊旺
 */
@RestController
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    private PmsProductService pmsProductService;

    /**
     * 查询商品信息
     * */
    @GetMapping("/list")
    public CommonResult getList(@Valid PmsProductQueryParam param,Integer pageNum,Integer pageSize){
        List<PmsProduct> list = pmsProductService.getList(param, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
