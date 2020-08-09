package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 会员与产品分类关系表（用户喜欢的分类）(UmsMemberProductCategoryRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberProductCategoryRelation implements Serializable {
    private static final long serialVersionUID = 944488991799355129L;
    
    private Long id;

    private Long memberId;
    
    private Long productCategoryId;



}