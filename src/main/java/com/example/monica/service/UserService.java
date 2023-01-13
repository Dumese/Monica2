package com.example.monica.service;

import com.example.monica.dto.LoginDTO;
import com.example.monica.dto.RegisterDTO;
import com.example.monica.vo.UserDetailVO;

public interface UserService {

    /*
    //通过id查询用户
    UserEntity selectUserById(@RequestParam Long id);



    //通过手机号查询用户
    UserEntity selectUserByPhone(@RequestParam Long phone);
    */



    //用户登录
    UserDetailVO login(LoginDTO loginDTO);


    //用户注册
    UserDetailVO register(RegisterDTO registerDTO);
    /*
    //增加用户
    UserEntity addUser(UserDTO userDTO);

     */
}
