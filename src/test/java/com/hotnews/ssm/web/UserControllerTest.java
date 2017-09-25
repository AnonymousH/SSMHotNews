package com.hotnews.ssm.web;

import com.hotnews.ssm.dao.BaseTest;
import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/25.
 */
public class UserControllerTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void signInByPhone() throws Exception {

        ResponsTemplate<String> stringResponsTemplate = userService.signInByPhone("13569632365","123455");
        System.out.println(stringResponsTemplate.toString());

    }

}