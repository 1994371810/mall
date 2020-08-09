package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 产品满减表(只针对同商品)(PmsProductFullReduction)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsProductFullReduction implements Serializable {
    private static final long serialVersionUID = 609963715790253097L;
    
    private Long id;
    
    private Long productId;
    
    private Double fullPrice;
    
    private Double reducePrice;



}