package com.hotnews.ssm.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/25.
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void signInByPhone() throws Exception {

        String userID = userDao.signInByPhone("13569632365", "12345");
        System.out.println("userID----  " + userID);

    }

}