package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 限时购表(SmsFlashPromotion)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsFlashPromotion implements Serializable {
    private static final long serialVersionUID = -26059011657267683L;
    
    private Long id;

    private String title;
        /**
    * 开始日期
    */
    private Object startDate;
        /**
    * 结束日期
    */
    private Object endDate;
        /**
    * 上下线状态
    */
    private Integer status;
        /**
    * 秒杀时间段名称
    */
    private Date createTime;



}