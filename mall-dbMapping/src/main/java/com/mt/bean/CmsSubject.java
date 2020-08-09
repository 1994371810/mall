package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 专题表(CmsSubject)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsSubject implements Serializable {
    private static final long serialVersionUID = 353918460546658061L;
    
    private Long id;
    
    private Long categoryId;
    
    private String title;
        /**
    * 专题主图
    */
    private String pic;
        /**
    * 关联产品数量
    */
    private Integer productCount;
    
    private Integer recommendStatus;
    
    private Date createTime;
    
    private Integer collectCount;
    
    private Integer readCount;
    
    private Integer commentCount;
        /**
    * 画册图片用逗号分割
    */
    private String albumPics;
    
    private String description;
        /**
    * 显示状态：0->不显示；1->显示
    */
    private Integer showStatus;
    
    private String content;
        /**
    * 转发数
    */
    private Integer forwardCount;
        /**
    * 专题分类名称
    */
    private String categoryName;



}