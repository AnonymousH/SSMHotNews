package com.hotnews.ssm.dao;

import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.entity.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/23
 *
 * @Description
 */
public class NewsDaoTest extends BaseTest {

    @Autowired
    NewsDao newsDao ;

    @Test
    public void queryNews() throws Exception {
        List<News> news = newsDao.queryNews("军事",0,0);
        System.out.printf("news==  "+news.toString());
    }


    @Test
    public void queryType() throws Exception {
        List<Category> category = newsDao.queryType();
        System.out.printf("category-------  "+category);
    }

}