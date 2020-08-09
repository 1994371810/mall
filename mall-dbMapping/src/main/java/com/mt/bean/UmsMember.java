package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员表(UmsMember)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMember implements Serializable {
    private static final long serialVersionUID = -27158746265396765L;
    
    private Long id;
    
    private Long memberLevelId;
        /**
    * 用户名
    */
    private String username;
        /**
    * 密码
    */
    private String password;
        /**
    * 昵称
    */
    private String nickname;
        /**
    * 手机号码
    */
    private String phone;
        /**
    * 帐号启用状态:0->禁用；1->启用
    */
    private Integer status;
        /**
    * 注册时间
    */
    private Date createTime;
        /**
    * 头像
    */
    private String icon;
        /**
    * 性别：0->未知；1->男；2->女
    */
    private Integer gender;
        /**
    * 生日
    */
    private Object birthday;
        /**
    * 所做城市
    */
    private String city;
        /**
    * 职业
    */
    private String job;
        /**
    * 个性签名
    */
    private String personalizedSignature;
        /**
    * 用户来源
    */
    private Integer sourceType;
        /**
    * 积分
    */
    private Integer integration;
        /**
    * 成长值
    */
    private Integer growth;
        /**
    * 剩余抽奖次数
    */
    private Integer luckeyCount;
        /**
    * 历史积分数量
    */
    private Integer historyIntegration;



}