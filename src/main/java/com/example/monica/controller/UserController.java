package com.example.monica.controller;

import com.example.monica.entity.UserEntity;
import com.example.monica.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Api(tags = "用户管理接口")
public class UserController{

    @Autowired
    protected UserService userService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ApiOperation(value = "根据id查询user")
    public UserEntity selectUserById(@RequestParam Long id) {
        return userService.selectUserById(id);
    }


    /*
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "新增user")
    public UserEntity addUser(@RequestBody UserDTO user){
        Map<String, Object> result = new HashMap<>();

        return userService.addUser();
    }
     */
}
