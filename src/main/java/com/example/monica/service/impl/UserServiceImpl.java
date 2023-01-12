package com.example.monica.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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

    private UserEntity user;

    @Override
    public UserEntity selectUserById(@RequestParam Long id) {
        user = userMapper.selectById(id);
        return user;
    }

    @Override
    public UserEntity selectUserByPhone(@RequestParam Long phone) {
        //UserEntity user = userMapper.selectOne(phone);
        //查询器
        LambdaQueryWrapper<UserEntity> wrapper = Wrappers.lambdaQuery(UserEntity.class);
        wrapper.eq(UserEntity::getPhone, phone);
        user = userMapper.selectOne(wrapper);
        return user;
    }

    @Override
    public UserEntity addUser(UserDTO userDTO) {
        user.setId(userDTO.getId());
        user.setPhone(userDTO.getPhone());
        user.setPassword(userDTO.getPassword());
        user.setNickName(userDTO.getNickName());
        userMapper.insert(user);
        return user;
    }
}


/*
    @Override
    public List<UserInfoTestVO> getUserInfo(String username) {
        // 查询器
        LambdaQueryWrapper<UserTestEntity> wrapper = Wrappers.lambdaQuery(UserTestEntity.class);
        // 根据什么查询
        wrapper.like(UserTestEntity::getUsername, username);
        // 查询出来如何显示
        List<UserTestEntity> userTests = userTestMapper.selectList(wrapper);
        // 变换list 两个对象相互匹配
        return BeanUtil.copyToList(userTests, UserInfoTestVO.class);
    }
 */