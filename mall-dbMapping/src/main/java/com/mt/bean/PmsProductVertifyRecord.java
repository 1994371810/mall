package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品审核记录(PmsProductVertifyRecord)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsProductVertifyRecord implements Serializable {
    private static final long serialVersionUID = 411145854479732810L;
    
    private Long id;
    
    private Long productId;
    
    private Date createTime;
        /**
    * 审核人
    */
    private String vertifyMan;
    
    private Integer status;
        /**
    * 反馈详情
    */
    private String detail;



}