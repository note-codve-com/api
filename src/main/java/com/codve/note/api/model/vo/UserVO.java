package com.codve.note.api.model.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author admin
 * @date 2020/8/18 13:50
 */
@Data
public class UserVO {

    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = "^[1][3-9][0-9]{9}$", message = "手机号码格式错误")
    private String mobile;

    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 18, message = "密码长度为 6 ~ 18 位")
    private String password;

    @NotBlank(message = "确认密码不能为空")
    @Size(min = 6, max = 18, message = "密码长度为 6 ~ 18 位")
    private String passwordConfirm;
}
