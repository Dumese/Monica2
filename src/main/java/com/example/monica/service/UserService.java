package com.example.monica.service;

import com.example.monica.dto.UserDTO;
import com.example.monica.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    //通过id查询用户
    UserEntity selectUserById(@RequestParam Long id);

    //通过手机号查询用户
    UserEntity selectUserByPhone(@RequestParam Long phone);

    //增加用户
    UserEntity addUser(UserDTO user);
}
