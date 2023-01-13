package com.example.monica.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.Email;

@Data
public class RegisterDTO {
    @ApiModelProperty("手机号")
    private Long phone;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("密码")
    private String password;

    @Email
    @ApiModelProperty("邮箱")
    private String email;
}
