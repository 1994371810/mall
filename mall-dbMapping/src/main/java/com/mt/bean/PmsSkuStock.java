package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * sku的库存(PmsSkuStock)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsSkuStock implements Serializable {
    private static final long serialVersionUID = -87361539700822069L;
    
    private Long id;
    
    private Long productId;
        /**
    * sku编码
    */
    private String skuCode;
    
    private Double price;
        /**
    * 库存
    */
    private Integer stock;
        /**
    * 预警库存
    */
    private Integer lowStock;
        /**
    * 展示图片
    */
    private String pic;
        /**
    * 销量
    */
    private Integer sale;
        /**
    * 单品促销价格
    */
    private Double promotionPrice;
        /**
    * 锁定库存
    */
    private Integer lockStock;
        /**
    * 商品销售属性，json格式
    */
    private String spData;



}