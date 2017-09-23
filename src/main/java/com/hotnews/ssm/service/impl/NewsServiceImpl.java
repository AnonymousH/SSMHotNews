package com.hotnews.ssm.service.impl;

import com.hotnews.ssm.dao.NewsDao;
import com.hotnews.ssm.entity.News;
import com.hotnews.ssm.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/22.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    public List<News> getNews(String type, int page, int limit) {
        return newsDao.queryNews(type, page, limit);
    }

    public String getType(int id) {
        return newsDao.queryType(id);
    }


}
