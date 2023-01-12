package com.example.monica.controller;

import com.example.monica.dto.UserDTO;
import com.example.monica.entity.UserEntity;
import com.example.monica.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
@Api(tags = "用户接口")
public class UserController{

    @Autowired
    protected UserService userService;

    @RequestMapping(value = "/selectUserById", method = RequestMethod.GET)
    @ApiOperation(value = "根据id查询user")
    public UserEntity selectUserById(@RequestParam Long id) {
        return userService.selectUserById(id);
    }


    @RequestMapping(value = "/selectUserByPhone", method = RequestMethod.GET)
    @ApiOperation(value = "根据id查询user")
    public UserEntity selectUserByPhone(@RequestParam Long phone) {
        return userService.selectUserByPhone(phone);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ApiOperation(value = "新增user")
    public UserEntity addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }
}
