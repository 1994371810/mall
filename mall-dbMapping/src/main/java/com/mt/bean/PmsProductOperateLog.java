package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * (PmsProductOperateLog)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsProductOperateLog implements Serializable {
    private static final long serialVersionUID = -66643081381173043L;
    
    private Long id;
    
    private Long productId;
    
    private Double priceOld;
    
    private Double priceNew;
    
    private Double salePriceOld;
    
    private Double salePriceNew;
        /**
    * 赠送的积分
    */
    private Integer giftPointOld;
    
    private Integer giftPointNew;
    
    private Integer usePointLimitOld;
    
    private Integer usePointLimitNew;
        /**
    * 操作人
    */
    private String operateMan;
    
    private Date createTime;



}