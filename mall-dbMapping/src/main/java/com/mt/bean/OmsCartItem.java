package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 购物车表(OmsCartItem)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsCartItem implements Serializable {
    private static final long serialVersionUID = -36772598401529899L;
    
    private Long id;
    
    private Long productId;
    
    private Long productSkuId;
    
    private Long memberId;
        /**
    * 购买数量
    */
    private Integer quantity;
        /**
    * 添加到购物车的价格
    */
    private Double price;
        /**
    * 商品主图
    */
    private String productPic;
        /**
    * 商品名称
    */
    private String productName;
        /**
    * 商品副标题（卖点）
    */
    private String productSubTitle;
        /**
    * 商品sku条码
    */
    private String productSkuCode;
        /**
    * 会员昵称
    */
    private String memberNickname;
        /**
    * 创建时间
    */
    private Date createDate;
        /**
    * 修改时间
    */
    private Date modifyDate;
        /**
    * 是否删除
    */
    private Integer deleteStatus;
        /**
    * 商品分类
    */
    private Long productCategoryId;
    
    private String productBrand;
    
    private String productSn;
        /**
    * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
    */
    private String productAttr;



}