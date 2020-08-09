package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 会员积分成长规则表(UmsMemberRuleSetting)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberRuleSetting implements Serializable {
    private static final long serialVersionUID = 784349335453273984L;
    
    private Long id;
        /**
    * 连续签到天数
    */
    private Integer continueSignDay;
        /**
    * 连续签到赠送数量
    */
    private Integer continueSignPoint;
        /**
    * 每消费多少元获取1个点
    */
    private Double consumePerPoint;
        /**
    * 最低获取点数的订单金额
    */
    private Double lowOrderAmount;
        /**
    * 每笔订单最高获取点数
    */
    private Integer maxPointPerOrder;
        /**
    * 类型：0->积分规则；1->成长值规则
    */
    private Integer type;



}