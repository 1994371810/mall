package com.mt.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mt.bean.PmsSkuStock;
import com.mt.mapper.PmsSkuStockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsSkuStockService {
    @Autowired
    private PmsSkuStockMapper skuStockMapper;

    /**
     * 查询产品sku信息
     * @param productId 产品id
     * @param skuCode     sku 编号
     * @return {@link List<PmsSkuStock>}
     */
    public List<PmsSkuStock> getList(Long productId,String skuCode){
        QueryWrapper qw = new QueryWrapper();
        qw.eq("product_id",productId);
        if(StrUtil.isNotBlank(skuCode)){
            qw.like("sku_code",skuCode);
        }
        return skuStockMapper.selectList(qw);
    }
}
