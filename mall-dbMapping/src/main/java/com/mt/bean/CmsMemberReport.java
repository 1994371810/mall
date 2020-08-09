package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户举报表(CmsMemberReport)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CmsMemberReport implements Serializable {
    private static final long serialVersionUID = -89433499265304325L;
    
    private Long id;
        /**
    * 举报类型：0->商品评价；1->话题内容；2->用户评论
    */
    private Integer reportType;
        /**
    * 举报人
    */
    private String reportMemberName;
    
    private Date createTime;
    
    private String reportObject;
        /**
    * 举报状态：0->未处理；1->已处理
    */
    private Integer reportStatus;
        /**
    * 处理结果：0->无效；1->有效；2->恶意
    */
    private Integer handleStatus;
    
    private String note;



}