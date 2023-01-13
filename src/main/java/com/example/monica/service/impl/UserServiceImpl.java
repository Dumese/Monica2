package com.example.monica.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.monica.dto.LoginDTO;
import com.example.monica.dto.RegisterDTO;
import com.example.monica.entity.UserEntity;
import com.example.monica.mapper.UserMapper;
import com.example.monica.service.UserService;
import com.example.monica.vo.UserDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    protected UserMapper userMapper;

    @Override
    public UserDetailVO login(LoginDTO loginDTO) {
        UserDetailVO userDetailVO = new UserDetailVO();
        //查询器
        LambdaQueryWrapper<UserEntity> wrapper = Wrappers.lambdaQuery(UserEntity.class);
        //输入的是手机号码
        if(loginDTO.getData().toString().length() == 11){
            wrapper.eq(UserEntity::getPhone, loginDTO.getData());
        }
        else{
            //输入的是id
            wrapper.eq(UserEntity::getId, loginDTO.getData());
        }
        wrapper.eq(UserEntity::getPassword, loginDTO.getPassword());
        UserEntity user =  userMapper.selectOne(wrapper);

        // 获取当前时间
        user.setLogin_time(LocalDateTime.now());
        user.setStatus(1);
        userMapper.updateById(user);

        //拷贝信息
        BeanUtil.copyProperties(user, userDetailVO);
        return userDetailVO;

    }

    public UserDetailVO register(RegisterDTO registerDTO){
        UserDetailVO userDetailVO = new UserDetailVO();
        UserEntity user = new UserEntity();

        BeanUtil.copyProperties(registerDTO, user);
        userMapper.insert(user);

        // 获取当前时间
        user.setLogin_time(LocalDateTime.now());
        userMapper.updateById(user);

        BeanUtil.copyProperties(user, userDetailVO);
        return userDetailVO;
    }

    public UserDetailVO update(UserDetailVO userDetailVO){

        return userDetailVO;
    }
}