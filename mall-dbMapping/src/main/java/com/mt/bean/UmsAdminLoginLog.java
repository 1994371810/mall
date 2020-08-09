package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户登录日志表(UmsAdminLoginLog)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsAdminLoginLog implements Serializable {
    private static final long serialVersionUID = -61955987672452801L;
    
    private Long id;
    
    private Long adminId;
    
    private Date createTime;
    
    private String ip;
    
    private String address;
        /**
    * 浏览器登录类型
    */
    private String userAgent;



}