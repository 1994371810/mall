package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 后台角色菜单关系表(UmsRoleMenuRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsRoleMenuRelation implements Serializable {
    private static final long serialVersionUID = 373845712785906853L;

    private Long id;
        /**
    * 角色ID
    */
    private Long roleId;
        /**
    * 菜单ID
    */
    private Long menuId;



}