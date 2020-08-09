package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 会员等级表(UmsMemberLevel)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberLevel implements Serializable {
    private static final long serialVersionUID = -26543851297766504L;
    
    private Long id;

    private String name;
    
    private Integer growthPoint;
        /**
    * 是否为默认等级：0->不是；1->是
    */
    private Integer defaultStatus;
        /**
    * 免运费标准
    */
    private Double freeFreightPoint;
        /**
    * 每次评价获取的成长值
    */
    private Integer commentGrowthPoint;
        /**
    * 是否有免邮特权
    */
    private Integer priviledgeFreeFreight;
        /**
    * 是否有签到特权
    */
    private Integer priviledgeSignIn;
        /**
    * 是否有评论获奖励特权
    */
    private Integer priviledgeComment;
        /**
    * 是否有专享活动特权
    */
    private Integer priviledgePromotion;
        /**
    * 是否有会员价格特权
    */
    private Integer priviledgeMemberPrice;
        /**
    * 是否有生日特权
    */
    private Integer priviledgeBirthday;
    
    private String note;



}