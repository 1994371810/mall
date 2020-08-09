package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 会员收货地址表(UmsMemberReceiveAddress)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberReceiveAddress implements Serializable {
    private static final long serialVersionUID = -77023077450680011L;
    
    private Long id;
    
    private Long memberId;
        /**
    * 收货人名称
    */
    private String name;
    
    private String phoneNumber;
        /**
    * 是否为默认
    */
    private Integer defaultStatus;
        /**
    * 邮政编码
    */
    private String postCode;
        /**
    * 省份/直辖市
    */
    private String province;
        /**
    * 城市
    */
    private String city;
        /**
    * 区
    */
    private String region;
        /**
    * 详细地址(街道)
    */
    private String detailAddress;



}