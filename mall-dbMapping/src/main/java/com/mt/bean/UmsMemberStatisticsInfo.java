package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberStatisticsInfo implements Serializable {
    private static final long serialVersionUID = 907605611518449342L;
    
    private Long id;
    
    private Long memberId;
        /**
    * 累计消费金额
    */
    private Double consumeAmount;
        /**
    * 订单数量
    */
    private Integer orderCount;
        /**
    * 优惠券数量
    */
    private Integer couponCount;
        /**
    * 评价数
    */
    private Integer commentCount;
        /**
    * 退货数量
    */
    private Integer returnOrderCount;
        /**
    * 登录次数
    */
    private Integer loginCount;
        /**
    * 关注数量
    */
    private Integer attendCount;
        /**
    * 粉丝数量
    */
    private Integer fansCount;
    
    private Integer collectProductCount;
    
    private Integer collectSubjectCount;
    
    private Integer collectTopicCount;
    
    private Integer collectCommentCount;
    
    private Integer inviteFriendCount;
        /**
    * 最后一次下订单时间
    */
    private Date recentOrderTime;



}