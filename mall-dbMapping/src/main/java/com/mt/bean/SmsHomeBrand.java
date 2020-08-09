package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 首页推荐品牌表(SmsHomeBrand)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeBrand implements Serializable {
    private static final long serialVersionUID = -70081279477793614L;
    
    private Long id;
    
    private Long brandId;
    
    private String brandName;
    
    private Integer recommendStatus;
    
    private Integer sort;



}