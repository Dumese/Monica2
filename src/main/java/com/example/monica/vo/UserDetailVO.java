package com.example.monica.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDetailVO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("手机号")
    private Long phone;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("性别")
    private int sex;

    @ApiModelProperty("头像")
    private String headshot;
}
