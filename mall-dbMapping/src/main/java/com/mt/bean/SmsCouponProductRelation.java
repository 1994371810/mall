package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 优惠券和产品的关系表(SmsCouponProductRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsCouponProductRelation implements Serializable {
    private static final long serialVersionUID = -81423783676199550L;
    
    private Long id;

    private Long couponId;
    
    private Long productId;
        /**
    * 商品名称
    */
    private String productName;
        /**
    * 商品编码
    */
    private String productSn;



}