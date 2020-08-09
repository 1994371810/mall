package com.mt.bean;

import java.util.Date;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 专题评论表(CmsSubjectComment)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsSubjectComment implements Serializable {
    private static final long serialVersionUID = -59185528500145595L;
    
    private Long id;
    
    private Long subjectId;
    
    private String memberNickName;
    
    private String memberIcon;
    
    private String content;
    
    private Date createTime;
    
    private Integer showStatus;



}