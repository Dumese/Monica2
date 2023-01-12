package com.example.monica.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class UserDTO {

    @ApiModelProperty("手机号")

    private Long phone;

    @ApiModelProperty("用户昵称")

    private String nickName;

    @ApiModelProperty("密码")

    private String password;

    //头像

    //注册时间
    @ApiModelProperty("注册时间")
    private Timestamp registration_date;

    //状态
}
