package com.example.monica.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.monica.dto.UserDTO;
import com.example.monica.entity.UserEntity;
import com.example.monica.mapper.UserMapper;
import com.example.monica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    protected UserMapper userMapper;

    //private UserEntity user;

    @Override
    public UserEntity selectUserById(@RequestParam Long id) {
        UserEntity user = userMapper.selectById(id);

        return user;
    }

    @Override
    public UserEntity selectUserByPhone(@RequestParam Long phone) {
        //user = userMapper.selectOne(phone);
        return null;
    }

    @Override
    public UserEntity addUser(UserDTO user) {
        return null;
    }
}
