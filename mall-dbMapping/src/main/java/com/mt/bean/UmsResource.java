package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台资源表(UmsResource)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsResource implements Serializable {
    private static final long serialVersionUID = 390822191381813028L;
    
    private Long id;
        /**
    * 创建时间
    */
    private Date createTime;
        /**
    * 资源名称
    */
    private String name;
        /**
    * 资源URL
    */
    private String url;
        /**
    * 描述
    */
    private String description;
        /**
    * 资源分类ID
    */
    private Long categoryId;



}