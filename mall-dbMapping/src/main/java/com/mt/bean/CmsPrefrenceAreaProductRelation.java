package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 优选专区和产品关系表(CmsPrefrenceAreaProductRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsPrefrenceAreaProductRelation implements Serializable {
    private static final long serialVersionUID = 797504981147348815L;
    
    private Long id;
    
    private Long prefrenceAreaId;
    
    private Long productId;



}