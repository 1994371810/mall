package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 优惠券使用、领取历史表(SmsCouponHistory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsCouponHistory implements Serializable {
    private static final long serialVersionUID = -16836183479870499L;
    
    private Long id;

    private Long couponId;
    
    private Long memberId;
    
    private String couponCode;
        /**
    * 领取人昵称
    */
    private String memberNickname;
        /**
    * 获取类型：0->后台赠送；1->主动获取
    */
    private Integer getType;
    
    private Date createTime;
        /**
    * 使用状态：0->未使用；1->已使用；2->已过期
    */
    private Integer useStatus;
        /**
    * 使用时间
    */
    private Date useTime;
        /**
    * 订单编号
    */
    private Long orderId;
        /**
    * 订单号码
    */
    private String orderSn;



}