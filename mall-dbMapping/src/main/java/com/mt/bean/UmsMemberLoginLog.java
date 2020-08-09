package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员登录记录(UmsMemberLoginLog)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberLoginLog implements Serializable {
    private static final long serialVersionUID = 370047606520763211L;
    
    private Long id;
    
    private Long memberId;
    
    private Date createTime;
    
    private String ip;
    
    private String city;
        /**
    * 登录类型：0->PC；1->android;2->ios;3->小程序
    */
    private Integer loginType;
    
    private String province;



}