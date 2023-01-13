package com.example.monica.service;

import com.example.monica.dto.LoginDTO;
import com.example.monica.dto.RegisterDTO;
import com.example.monica.vo.UserDetailVO;

public interface UserService {

    //用户登录
    UserDetailVO login(LoginDTO loginDTO);

    //用户注册
    UserDetailVO register(RegisterDTO registerDTO);

    //更新用户信息
    UserDetailVO update(UserDetailVO userDetailVO);
}
