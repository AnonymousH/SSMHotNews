package com.hotnews.ssm.dao.data;

/**
 * Created by AnonymousH on 2017/9/23
 *
 * @Description   分割抓取数据 从一张表转存到多张表中
 */
public interface SQLData {

    void insertCategory(String uid , String category);

}
