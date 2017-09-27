package com.hotnews.ssm.web;

import com.hotnews.ssm.dao.BaseTest;
import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/25.
 */
public class UserControllerTest extends BaseTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void signInByPhone() throws Exception {

        ResponsTemplate<String> stringResponsTemplate = userService.signInByPhone("18888888323", "123455");
        System.out.println(stringResponsTemplate.toString());

    }

    @Test
    public void signUpWithPhone() throws Exception {

        ResponsTemplate<String> stringResponsTemplate = userService.signUpWithPhone("18888888323", "123455");
        System.out.println(stringResponsTemplate.toString());
        logger.info("result---------  "+stringResponsTemplate.toString());

    }

}