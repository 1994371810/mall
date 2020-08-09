package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 会员任务表(UmsMemberTask)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberTask implements Serializable {
    private static final long serialVersionUID = -32220342085738999L;
    
    private Long id;

    private String name;
        /**
    * 赠送成长值
    */
    private Integer growth;
        /**
    * 赠送积分
    */
    private Integer intergration;
        /**
    * 任务类型：0->新手任务；1->日常任务
    */
    private Integer type;



}