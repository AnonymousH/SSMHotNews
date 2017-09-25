package com.hotnews.ssm.web;

import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.service.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/signInByPhone", method = RequestMethod.POST)
    public ResponsTemplate<String> signInByPhone (String phone , String password) {
        return userService.signInByPhone(phone,password);
    }

}
