package com.hotnews.ssm.service;

import com.github.pagehelper.PageInfo;
import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.entity.HotNews;
import com.hotnews.ssm.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/22.
 */
public interface NewsService {

    List<News> getNews(String type, int page, int limit);

    List<Category> getType();

    PageInfo getHotNews(String type, int page, int limit);

    int getCategoryNum(String type);
}
