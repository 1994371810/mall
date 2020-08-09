package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户角色表(UmsRole)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsRole implements Serializable {
    private static final long serialVersionUID = 769969073229178393L;
    
    private Long id;
        /**
    * 名称
    */
    private String name;
        /**
    * 描述
    */
    private String description;
        /**
    * 后台用户数量
    */
    private Integer adminCount;
        /**
    * 创建时间
    */
    private Date createTime;
        /**
    * 启用状态：0->禁用；1->启用
    */
    private Integer status;
    
    private Integer sort;



}