package com.hotnews.ssm.dao;

import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.entity.HotNews;
import com.hotnews.ssm.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/22.
 */
public interface NewsDao {

    List<News> queryNews(@Param("type")String type, @Param("page")int page, @Param("limit")int limit);

    List<Category> queryType();

    List<HotNews> queryHotNews(@Param("type")String type, @Param("page")int page, @Param("limit")int limit);

    int selectCategoryNum(@Param("type")String type);



}
