package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 运费模版(PmsFeightTemplate)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsFeightTemplate implements Serializable {
    private static final long serialVersionUID = -33018826288054679L;
    
    private Long id;
    
    private String name;
        /**
    * 计费类型:0->按重量；1->按件数
    */
    private Integer chargeType;
        /**
    * 首重kg
    */
    private Double firstWeight;
        /**
    * 首费（元）
    */
    private Double firstFee;
    
    private Double continueWeight;
    
    private Double continmeFee;
        /**
    * 目的地（省、市）
    */
    private String dest;



}