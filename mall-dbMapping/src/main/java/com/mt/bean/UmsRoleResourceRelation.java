package com.mt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 后台角色资源关系表(UmsRoleResourceRelation)实体类
 *
 * @author 郭俊旺
 * @since 2020-08-08 16:22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsRoleResourceRelation implements Serializable {
    private static final long serialVersionUID = -32757713550726858L;

    private Long id;
        /**
    * 角色ID
    */
    private Long roleId;
        /**
    * 资源ID
    */
    private Long resourceId;



}