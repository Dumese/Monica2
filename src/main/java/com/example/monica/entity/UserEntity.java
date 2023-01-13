package com.example.monica.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.Email;
import java.sql.Timestamp;
import java.time.LocalDateTime;


@Data
@TableName("user")
public class UserEntity {
    //用户id
    @TableId(value = "id")
    private Long id;

    //用户昵称
    @TableField("nickName")
    private String nickName;

    //密码
    @TableField("password")
    private String password;

    //手机号码
    @TableField("phone")
    private Long phone;

    //邮箱
    @Email
    @TableField("email")
    private String email;

    //性别
    @TableField("sex")
    private int sex;

    //头像
    @TableField("headshot")
    private String headshot;

    //状态
    @TableField("status")
    private int status;

    //登录时间
    @TableField(value = "login_time")
    private LocalDateTime login_time;

    //注册时间
    @TableField(value = "register_time")
    private String register_time;
}
