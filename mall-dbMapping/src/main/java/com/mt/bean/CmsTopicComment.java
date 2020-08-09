package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 专题评论表(CmsTopicComment)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsTopicComment implements Serializable {
    private static final long serialVersionUID = 344107296522423775L;
    
    private Long id;
    
    private String memberNickName;
    
    private Long topicId;
    
    private String memberIcon;
    
    private String content;
    
    private Date createTime;
    
    private Integer showStatus;



}