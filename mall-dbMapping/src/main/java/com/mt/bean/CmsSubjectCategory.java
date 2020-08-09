package com.mt.bean;

import java.io.Serializable;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 专题分类表(CmsSubjectCategory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsSubjectCategory implements Serializable {
    private static final long serialVersionUID = -88713684374236637L;
    
    private Long id;
    
    private String name;
        /**
    * 分类图标
    */
    private String icon;
        /**
    * 专题数量
    */
    private Integer subjectCount;
    
    private Integer showStatus;
    
    private Integer sort;



}