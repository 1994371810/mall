package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 人气推荐商品表(SmsHomeRecommendProduct)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeRecommendProduct implements Serializable {
    private static final long serialVersionUID = -60252166738742575L;
    
    private Long id;
    
    private Long productId;
    
    private String productName;
    
    private Integer recommendStatus;
    
    private Integer sort;



}