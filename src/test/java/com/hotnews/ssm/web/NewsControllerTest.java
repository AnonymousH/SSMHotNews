package com.hotnews.ssm.web;

import com.hotnews.ssm.dao.BaseTest;
import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.entity.News;
import com.hotnews.ssm.service.NewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by AnonymousH on 2017/9/25.
 */
public class NewsControllerTest extends BaseTest {


    @Autowired
    private NewsService newsService;

    @Test
    public void getNews() throws Exception {

        List<News> newsList = newsService.getNews("yl", 0, 0);
        System.out.println(newsList.toString());

    }

    @Test
    public void getCategoryType() throws Exception {

        List<Category> categories = newsService.getType();

        System.out.println(categories.toString());

    }

}