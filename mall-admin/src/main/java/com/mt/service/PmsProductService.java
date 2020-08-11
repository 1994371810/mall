package com.mt.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.mt.bean.PmsProduct;
import com.mt.dto.PmsProductQueryParam;
import com.mt.mapper.PmsProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.QuerydslWebConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductService {

    @Autowired
    private PmsProductMapper pmsProductMapper;


    public List<PmsProduct> getList(PmsProductQueryParam param,Integer pageNum,Integer pageSize){
        QueryWrapper qw = new QueryWrapper();

        if(param.getPublishStatus()!=null){
            qw.eq("publish_status",param.getPublishStatus());
        }

        if(param.getPublishStatus()!=null){
            qw.eq("verify_status",param.getVerifyStatus());
        }

        if(StrUtil.isNotBlank(param.getKeyword())){
            qw.like("keyword",param.getKeyword());
        }

        if(StrUtil.isNotBlank(param.getProductSn())){
            qw.eq("product_sn",param.getProductSn());
        }

        if(param.getProductCategoryId()!=null){
            qw.eq("product_category_id",param.getProductCategoryId());
        }

        if(param.getBrandId()!=null){
            qw.eq("brand_id",param.getBrandId());
        }
        PageHelper.startPage(pageNum,pageSize);
        return pmsProductMapper.selectList(qw);
    }

}
