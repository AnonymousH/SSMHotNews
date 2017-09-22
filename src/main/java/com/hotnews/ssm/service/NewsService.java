package com.hotnews.ssm.service;

import com.hotnews.ssm.entity.News;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/22.
 */
public interface NewsService {

    List<News> getNews(String type, int page, int limit);

}
