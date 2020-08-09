package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 优选专区(CmsPrefrenceArea)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsPrefrenceArea implements Serializable {
    private static final long serialVersionUID = -54398498995859730L;
    
    private Long id;
    
    private String name;
    
    private String subTitle;
        /**
    * 展示图片
    */
    private Object pic;
    
    private Integer sort;
    
    private Integer showStatus;



}