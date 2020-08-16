package com.mt.dto;

import com.mt.validate.FlagValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 添加更新产品分类的参数
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductCategoryParam {
    /*父分类的编号*/
    private Long parentId;

    /*商品分类名称*/
    @NotEmpty(message = "商品分类名称不能为空")
    private String name;

    /*分类单位*/
    private String productUnit;
    /*是否在导航栏显示*/
    @FlagValidator(value = {"0","1"},message = "状态只能为0或1")
    private Integer navStatus;

    /*是否进行显示*/
    @FlagValidator(value = {"0","1"},message = "状态只能为0或1")
    private Integer showStatus;

    /*排序最小为0*/
    private Integer sort;

    /*图标*/
    private String icon;

    /*关键字*/
    private String keywords;
    /*描述*/
    private String description;

    /*产品相关筛选属性集合*/
    private List<Long> productAttributeIdList;
}
