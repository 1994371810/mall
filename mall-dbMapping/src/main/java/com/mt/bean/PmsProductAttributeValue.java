package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = -43947350563613951L;
    
    private Long id;

    private Long productId;
    
    private Long productAttributeId;
        /**
    * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
    */
    private String value;



}