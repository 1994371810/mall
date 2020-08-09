package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 订单设置表(OmsOrderSetting)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderSetting implements Serializable {
    private static final long serialVersionUID = 530622713112658702L;
    
    private Long id;
        /**
    * 秒杀订单超时关闭时间(分)
    */
    private Integer flashOrderOvertime;
        /**
    * 正常订单超时时间(分)
    */
    private Integer normalOrderOvertime;
        /**
    * 发货后自动确认收货时间（天）
    */
    private Integer confirmOvertime;
        /**
    * 自动完成交易时间，不能申请售后（天）
    */
    private Integer finishOvertime;
        /**
    * 订单完成后自动好评时间（天）
    */
    private Integer commentOvertime;



}