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
    @TableField("headPortrait")
    private String headPortrait;

    //注册时间
    @TableField("creat_time")
    private Timestamp creat_time;

    //状态
}
