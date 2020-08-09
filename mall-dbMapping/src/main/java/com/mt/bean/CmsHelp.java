package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 帮助表(CmsHelp)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsHelp implements Serializable {
    private static final long serialVersionUID = -70392558704886607L;
    
    private Long id;
    
    private Long categoryId;
    
    private String icon;
    
    private String title;
    
    private Integer showStatus;
    
    private Date createTime;
    
    private Integer readCount;
    
    private String content;



}