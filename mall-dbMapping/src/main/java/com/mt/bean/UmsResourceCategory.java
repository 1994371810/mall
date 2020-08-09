package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 资源分类表(UmsResourceCategory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsResourceCategory implements Serializable {
    private static final long serialVersionUID = -40644501078425463L;
    
    private Long id;
        /**
    * 创建时间
    */
    private Date createTime;
        /**
    * 分类名称
    */
    private String name;
        /**
    * 排序
    */
    private Integer sort;



}