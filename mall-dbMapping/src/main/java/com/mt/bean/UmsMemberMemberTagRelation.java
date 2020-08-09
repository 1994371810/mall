package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户和标签关系表(UmsMemberMemberTagRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberMemberTagRelation implements Serializable {
    private static final long serialVersionUID = 919089735491833484L;
    
    private Long id;
    
    private Long memberId;
    
    private Long tagId;



}