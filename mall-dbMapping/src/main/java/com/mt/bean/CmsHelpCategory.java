package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 帮助分类表(CmsHelpCategory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsHelpCategory implements Serializable {
    private static final long serialVersionUID = 444941139526794017L;
    
    private Long id;
    
    private String name;
        /**
    * 分类图标
    */
    private String icon;
        /**
    * 专题数量
    */
    private Integer helpCount;
    
    private Integer showStatus;
    
    private Integer sort;



}