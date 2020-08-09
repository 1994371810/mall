package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderOperateHistory implements Serializable {
    private static final long serialVersionUID = -23691335205740532L;
    
    private Long id;
        /**
    * 订单id
    */
    private Long orderId;
        /**
    * 操作人：用户；系统；后台管理员
    */
    private String operateMan;
        /**
    * 操作时间
    */
    private Date createTime;
        /**
    * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
    */
    private Integer orderStatus;
        /**
    * 备注
    */
    private String note;



}