package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 限时购通知记录(SmsFlashPromotionLog)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsFlashPromotionLog implements Serializable {
    private static final long serialVersionUID = 946215864052248504L;
    
    private Integer id;
    
    private Integer memberId;
    
    private Long productId;
    
    private String memberPhone;
    
    private String productName;
        /**
    * 会员订阅时间
    */
    private Date subscribeTime;
    
    private Date sendTime;



}