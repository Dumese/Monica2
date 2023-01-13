package com.example.monica.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.monica.entity.UserEntity;
import com.example.monica.vo.UserDetailVO;
import org.mapstruct.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<UserEntity>{
    //获取用户信息
    UserDetailVO user();
}
