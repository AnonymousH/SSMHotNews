package com.hotnews.ssm.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by AnonymousH on 2017/9/21.
 */
public interface UserDao {

    String signInByPhone(String phone,String password);

    String signUpWithPhone(String phone ,String password);

    String checkPhoneIsUse(String phone);

    void insertUser(@Param("userID") String userID , @Param("userPhone")String userPhone , @Param("userName")String userName , @Param("userPass")String userPass);

}
