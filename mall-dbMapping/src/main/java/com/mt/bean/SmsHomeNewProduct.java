package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 新鲜好物表(SmsHomeNewProduct)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeNewProduct implements Serializable {
    private static final long serialVersionUID = -28758406764954522L;
    
    private Long id;
    
    private Long productId;
    
    private String productName;
    
    private Integer recommendStatus;
    
    private Integer sort;



}