package com.mt.bean;

import java.util.Date;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 话题表(CmsTopic)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsTopic implements Serializable {
    private static final long serialVersionUID = -10629137889135809L;
    
    private Long id;
    
    private Long categoryId;
    
    private String name;
    
    private Date createTime;
    
    private Date startTime;
    
    private Date endTime;
        /**
    * 参与人数
    */
    private Integer attendCount;
        /**
    * 关注人数
    */
    private Integer attentionCount;
    
    private Integer readCount;
        /**
    * 奖品名称
    */
    private String awardName;
        /**
    * 参与方式
    */
    private String attendType;
        /**
    * 话题内容
    */
    private String content;



}