package com.hotnews.ssm.service.impl;

import com.hotnews.ssm.dao.UserDao;
import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AnonymousH on 2017/9/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void signUp() {

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
