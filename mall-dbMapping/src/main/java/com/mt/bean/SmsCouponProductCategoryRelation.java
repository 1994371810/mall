package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 优惠券和产品分类关系表(SmsCouponProductCategoryRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsCouponProductCategoryRelation implements Serializable {
    private static final long serialVersionUID = 487624400293425373L;
    
    private Long id;
    
    private Long couponId;

    private Long productCategoryId;
        /**
    * 产品分类名称
    */
    private String productCategoryName;
        /**
    * 父分类名称
    */
    private String parentCategoryName;



}