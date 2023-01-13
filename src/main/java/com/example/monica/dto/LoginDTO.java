package com.example.monica.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginDTO {
    @ApiModelProperty("手机号/id")
    private Long data;

    @ApiModelProperty("密码")
    private String password;
}
