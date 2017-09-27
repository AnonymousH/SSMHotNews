package com.hotnews.ssm.dao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/25.
 */
public class UserDaoTest extends BaseTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserDao userDao;

    @Test
    public void signInByPhone() throws Exception {

        String userID = userDao.signInByPhone("13569632365", "12345");
        System.out.println("userID----  " + userID);

    }

    @Test
    public void checkPhoneIsUse() throws Exception {

        String userID = userDao.checkPhoneIsUse("13569632365");
        System.out.println("userID----  " + userID);
        logger.info("userID----  " + userID);
        logger.error("userID----  " + userID);
        logger.debug("userID----  " + userID);
        logger.warn("userID----  " + userID);

    }


    @Test
    public void insertUser() throws Exception {

        String uid = UUID.randomUUID().toString();
        userDao.insertUser(uid, "13569632365", "13569632365", "451323521");


    }


}