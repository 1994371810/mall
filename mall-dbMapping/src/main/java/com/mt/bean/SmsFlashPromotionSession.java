package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 限时购场次表(SmsFlashPromotionSession)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsFlashPromotionSession implements Serializable {
    private static final long serialVersionUID = 763871459506588447L;
        /**
    * 编号
    */
    private Long id;
        /**
    * 场次名称
    */
    private String name;
        /**
    * 每日开始时间
    */
    private Object startTime;
        /**
    * 每日结束时间
    */
    private Object endTime;
        /**
    * 启用状态：0->不启用；1->启用
    */
    private Integer status;
        /**
    * 创建时间
    */
    private Date createTime;



}