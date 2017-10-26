package com.hotnews.ssm.dao;

import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.entity.HotNews;
import com.hotnews.ssm.entity.News;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/23
 *
 * @Description
 */
public class NewsDaoTest extends BaseTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

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


    @Test
    public void selectCategoryNum() throws Exception {
        int num = newsDao.selectCategoryNum("军事");
        System.out.printf("category--num-----  "+num);
    }

    @Test
    public void queryHotNews() throws Exception {
        List<HotNews> queryHotNews = newsDao.queryHotNews("军事",0,0);
//        System.out.printf("category--num-----  "+queryHotNews.size());
        logger.info(queryHotNews.toString());
    }

}