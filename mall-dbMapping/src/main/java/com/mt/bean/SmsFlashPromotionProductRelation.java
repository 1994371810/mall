package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 商品限时购与商品关系表(SmsFlashPromotionProductRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsFlashPromotionProductRelation implements Serializable {
    private static final long serialVersionUID = 761494138915267262L;
        /**
    * 编号
    */
    private Long id;

    private Long flashPromotionId;
        /**
    * 编号
    */
    private Long flashPromotionSessionId;
    
    private Long productId;
        /**
    * 限时购价格
    */
    private Double flashPromotionPrice;
        /**
    * 限时购数量
    */
    private Integer flashPromotionCount;
        /**
    * 每人限购数量
    */
    private Integer flashPromotionLimit;
        /**
    * 排序
    */
    private Integer sort;



}