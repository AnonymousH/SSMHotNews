package com.hotnews.ssm.service;

import com.hotnews.ssm.dto.ResponsTemplate;

/**
 * Created by AnonymousH on 2017/9/21.
 */
public interface UserService {

    void signUp();

    ResponsTemplate<String> signInByPhone(String phone , String password);

}
