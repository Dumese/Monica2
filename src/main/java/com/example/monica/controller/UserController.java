package com.example.monica.controller;

import com.example.monica.dto.LoginDTO;
import com.example.monica.dto.RegisterDTO;
import com.example.monica.service.UserService;
import com.example.monica.vo.UserDetailVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Api(tags = "用户接口")
public class UserController{

    @Autowired
    protected UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录")
    public UserDetailVO Login(@RequestBody @Validated LoginDTO loginDTO) {
        return userService.login(loginDTO);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation(value = "注册")
    public UserDetailVO register(@RequestBody @Validated RegisterDTO registerDTO){
        return userService.register(registerDTO);
    }

}
