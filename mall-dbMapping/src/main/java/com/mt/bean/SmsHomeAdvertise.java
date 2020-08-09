package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 首页轮播广告表(SmsHomeAdvertise)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeAdvertise implements Serializable {
    private static final long serialVersionUID = 347042360571363193L;
    
    private Long id;
    
    private String name;
        /**
    * 轮播位置：0->PC首页轮播；1->app首页轮播
    */
    private Integer type;
    
    private String pic;
    
    private Date startTime;
    
    private Date endTime;
        /**
    * 上下线状态：0->下线；1->上线
    */
    private Integer status;
        /**
    * 点击数
    */
    private Integer clickCount;
        /**
    * 下单数
    */
    private Integer orderCount;
        /**
    * 链接地址
    */
    private String url;
        /**
    * 备注
    */
    private String note;
        /**
    * 排序
    */
    private Integer sort;



}