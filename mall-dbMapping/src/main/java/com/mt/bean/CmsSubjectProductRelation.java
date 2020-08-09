package com.mt.bean;

import java.io.Serializable;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 专题商品关系表(CmsSubjectProductRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsSubjectProductRelation implements Serializable {
    private static final long serialVersionUID = -16834705084238072L;
    
    private Long id;
    
    private Long subjectId;
    
    private Long productId;



}