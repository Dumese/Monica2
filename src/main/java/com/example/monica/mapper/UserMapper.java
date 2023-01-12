package com.example.monica.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.monica.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserEntity>{

    //获取用户信息
    UserEntity user();
}
