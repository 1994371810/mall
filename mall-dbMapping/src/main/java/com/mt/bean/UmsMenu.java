package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台菜单表(UmsMenu)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMenu implements Serializable {
    private static final long serialVersionUID = -45550780348061394L;
    
    private Long id;
        /**
    * 父级ID
    */
    private Long parentId;
        /**
    * 创建时间
    */
    private Date createTime;
        /**
    * 菜单名称
    */
    private String title;
        /**
    * 菜单级数
    */
    private Integer level;
        /**
    * 菜单排序
    */
    private Integer sort;
        /**
    * 前端名称
    */
    private String name;
        /**
    * 前端图标
    */
    private String icon;
        /**
    * 前端隐藏
    */
    private Integer hidden;



}