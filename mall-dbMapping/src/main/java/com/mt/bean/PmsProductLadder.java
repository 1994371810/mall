package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 产品阶梯价格表(只针对同商品)(PmsProductLadder)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsProductLadder implements Serializable {
    private static final long serialVersionUID = 535521773942457255L;
    
    private Long id;
    
    private Long productId;
        /**
    * 满足的商品数量
    */
    private Integer count;
        /**
    * 折扣
    */
    private Double discount;
        /**
    * 折后价格
    */
    private Double price;



}