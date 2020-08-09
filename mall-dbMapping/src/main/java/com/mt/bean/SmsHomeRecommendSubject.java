package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 首页推荐专题表(SmsHomeRecommendSubject)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeRecommendSubject implements Serializable {
    private static final long serialVersionUID = -98434287958301716L;
    
    private Long id;
    
    private Long subjectId;
    
    private String subjectName;
    
    private Integer recommendStatus;
    
    private Integer sort;



}