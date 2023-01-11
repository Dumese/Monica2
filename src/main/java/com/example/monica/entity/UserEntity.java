package com.example.monica.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("user")
public class UserEntity {
    //用户id
    @TableId
    private Long id;

    //用户昵称
    @TableField("nickName")
    private String nickName;

    //手机号码
    @TableField("phone")
    private Long phone;

    //密码
    @TableField("password")
    private String password;

    //头像

    //注册时间
    @TableField("registration_date")
    private Timestamp registration_date;

    //状态
}
