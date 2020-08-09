package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品评价表(PmsComment)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsComment implements Serializable {
    private static final long serialVersionUID = 789122923546756386L;
    
    private Long id;
    
    private Long productId;
    
    private String memberNickName;
    
    private String productName;
        /**
    * 评价星数：0->5
    */
    private Integer star;
        /**
    * 评价的ip
    */
    private String memberIp;
    
    private Date createTime;
    
    private Integer showStatus;
        /**
    * 购买时的商品属性
    */
    private String productAttribute;
    
    private Integer collectCouont;
    
    private Integer readCount;
    
    private String content;
        /**
    * 上传图片地址，以逗号隔开
    */
    private String pics;
        /**
    * 评论用户头像
    */
    private String memberIcon;
    
    private Integer replayCount;



}