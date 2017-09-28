package com.hotnews.ssm.web;

import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/21.
 */
@Controller
@RequestMapping("/user")
@Api(tags = "User" , value = "/user", description = "用户操作相关")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "手机号码登录", notes = "手机号码登录", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "用户手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/signInByPhone", method = RequestMethod.POST)
    public ResponsTemplate<String> signInByPhone (String phone , String password) {
        return userService.signInByPhone(phone,password);
    }


    @ApiOperation(value = "手机号码注册", notes = "手机号码注册", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "用户手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "/signUpWithPhone", method = RequestMethod.POST)
    public ResponsTemplate<String> signUpWithPhone (String phone , String password) {
        return userService.signUpWithPhone(phone,password);
    }



}
