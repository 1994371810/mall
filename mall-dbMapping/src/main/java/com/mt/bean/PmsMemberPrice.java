package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 商品会员价格表(PmsMemberPrice)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsMemberPrice implements Serializable {
    private static final long serialVersionUID = -60147422924058687L;
    
    private Long id;
    
    private Long productId;
    
    private Long memberLevelId;
        /**
    * 会员价格
    */
    private Double memberPrice;
    
    private String memberLevelName;



}