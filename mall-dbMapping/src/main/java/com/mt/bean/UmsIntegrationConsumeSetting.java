package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 积分消费设置(UmsIntegrationConsumeSetting)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsIntegrationConsumeSetting implements Serializable {
    private static final long serialVersionUID = -23788126822921220L;
    
    private Long id;
        /**
    * 每一元需要抵扣的积分数量
    */
    private Integer deductionPerAmount;
        /**
    * 每笔订单最高抵用百分比
    */
    private Integer maxPercentPerOrder;
        /**
    * 每次使用积分最小单位100
    */
    private Integer useUnit;
        /**
    * 是否可以和优惠券同用；0->不可以；1->可以
    */
    private Integer couponStatus;



}