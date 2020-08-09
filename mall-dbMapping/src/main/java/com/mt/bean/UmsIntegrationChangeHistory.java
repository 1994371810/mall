package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 积分变化历史记录表(UmsIntegrationChangeHistory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsIntegrationChangeHistory implements Serializable {
    private static final long serialVersionUID = 314950774460272552L;
    
    private Long id;

    private Long memberId;
    
    private Date createTime;
        /**
    * 改变类型：0->增加；1->减少
    */
    private Integer changeType;
        /**
    * 积分改变数量
    */
    private Integer changeCount;
        /**
    * 操作人员
    */
    private String operateMan;
        /**
    * 操作备注
    */
    private String operateNote;
        /**
    * 积分来源：0->购物；1->管理员修改
    */
    private Integer sourceType;



}