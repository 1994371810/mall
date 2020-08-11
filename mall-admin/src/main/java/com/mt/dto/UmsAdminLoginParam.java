package com.mt.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * Created by 郭俊旺 on 2020/8/10 10:39
 *
 * @author 郭俊旺
 */
@Getter
@Setter
public class UmsAdminLoginParam {

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

}
