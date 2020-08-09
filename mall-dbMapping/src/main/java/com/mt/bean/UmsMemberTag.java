package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户标签表(UmsMemberTag)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberTag implements Serializable {
    private static final long serialVersionUID = -19224334089638169L;
    
    private Long id;

    private String name;
        /**
    * 自动打标签完成订单数量
    */
    private Integer finishOrderCount;
        /**
    * 自动打标签完成订单金额
    */
    private Double finishOrderAmount;



}