package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 产品属性分类表(PmsProductAttributeCategory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsProductAttributeCategory implements Serializable {
    private static final long serialVersionUID = -67231514273328183L;
    
    private Long id;
    
    private String name;
        /**
    * 属性数量
    */
    private Integer attributeCount;
        /**
    * 参数数量
    */
    private Integer paramCount;



}