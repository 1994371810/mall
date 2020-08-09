package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 品牌表(PmsBrand)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = 867068047514172619L;

    private Long id;
    
    private String name;
        /**
    * 首字母
    */
    private String firstLetter;
    
    private Integer sort;
        /**
    * 是否为品牌制造商：0->不是；1->是
    */
    private Integer factoryStatus;
    
    private Integer showStatus;
        /**
    * 产品数量
    */
    private Integer productCount;
        /**
    * 产品评论数量
    */
    private Integer productCommentCount;
        /**
    * 品牌logo
    */
    private String logo;
        /**
    * 专区大图
    */
    private String bigPic;
        /**
    * 品牌故事
    */
    private String brandStory;



}