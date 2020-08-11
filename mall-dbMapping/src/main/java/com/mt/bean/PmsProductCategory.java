package com.mt.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 产品分类(PmsProductCategory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

@Accessors(chain = true)
public class PmsProductCategory implements Serializable {
    private static final long serialVersionUID = -33431299882734419L;
    
    private Long id;
        /**
    * 上机分类的编号：0表示一级分类
    */
    private Long parentId;
    
    private String name;
        /**
    * 分类级别：0->1级；1->2级
    */
    private Integer level;
    
    private Integer productCount;
    
    private String productUnit;
        /**
    * 是否显示在导航栏：0->不显示；1->显示
    */
    private Integer navStatus;
        /**
    * 显示状态：0->不显示；1->显示
    */
    private Integer showStatus;
    
    private Integer sort;
        /**
    * 图标
    */
    private String icon;
    
    private String keywords;
        /**
    * 描述
    */
    private String description;

    @TableField(exist = false)
    private List<PmsProductCategory> children;


}