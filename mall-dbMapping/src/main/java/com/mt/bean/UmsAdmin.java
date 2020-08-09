package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户表(UmsAdmin)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsAdmin implements Serializable {
    private static final long serialVersionUID = -27134665654892277L;
    
    private Long id;
    
    private String username;
    
    private String password;
        /**
    * 头像
    */
    private String icon;
        /**
    * 邮箱
    */
    private String email;
        /**
    * 昵称
    */
    private String nickName;
        /**
    * 备注信息
    */
    private String note;
        /**
    * 创建时间
    */
    private Date createTime;
        /**
    * 最后登录时间
    */
    private Date loginTime;
        /**
    * 帐号启用状态：0->禁用；1->启用
    */
    private Integer status;



}