package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 退货原因表(OmsOrderReturnReason)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderReturnReason implements Serializable {
    private static final long serialVersionUID = -40223891859625893L;
    
    private Long id;
        /**
    * 退货类型
    */
    private String name;
    
    private Integer sort;
        /**
    * 状态：0->不启用；1->启用
    */
    private Integer status;
        /**
    * 添加时间
    */
    private Date createTime;



}