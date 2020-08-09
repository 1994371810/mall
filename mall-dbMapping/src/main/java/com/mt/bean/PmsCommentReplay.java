package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 产品评价回复表(PmsCommentReplay)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsCommentReplay implements Serializable {
    private static final long serialVersionUID = -51033513657191406L;
    
    private Long id;
    
    private Long commentId;
    
    private String memberNickName;
    
    private String memberIcon;
    
    private String content;
    
    private Date createTime;
        /**
    * 评论人员类型；0->会员；1->管理员
    */
    private Integer type;



}