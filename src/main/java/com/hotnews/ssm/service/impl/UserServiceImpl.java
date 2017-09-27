package com.hotnews.ssm.service.impl;

import com.hotnews.ssm.dao.UserDao;
import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by AnonymousH on 2017/9/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public ResponsTemplate<String> signUpWithPhone(String phone, String password) {

        ResponsTemplate<String> stringResponsTemplate = new ResponsTemplate<String>();
        String userID = userDao.checkPhoneIsUse(phone);
        if(userID!=null){
            stringResponsTemplate.setMsg("该号码已经注册!");
            stringResponsTemplate.setCode(0);
            stringResponsTemplate.setData("");

            return stringResponsTemplate;
        }

        String uid = UUID.randomUUID().toString();
        userDao.insertUser(uid, phone, phone, password);

        stringResponsTemplate.setMsg("success");
        stringResponsTemplate.setCode(1);
        stringResponsTemplate.setData(uid);


        return stringResponsTemplate;
    }

    public ResponsTemplate<String> signInByPhone(String phone , String password) {
       String userID = userDao.signInByPhone(phone,password);

        ResponsTemplate<String> stringResponsTemplate = new ResponsTemplate<String>();
       if(userID!=null){
            stringResponsTemplate.setData(userID);
            stringResponsTemplate.setCode(1);
            stringResponsTemplate.setMsg("");
       }else {
           stringResponsTemplate.setData("");
           stringResponsTemplate.setCode(0);
           stringResponsTemplate.setMsg("");
       }

       return stringResponsTemplate;

    }
}
