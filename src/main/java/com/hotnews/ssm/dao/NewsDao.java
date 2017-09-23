package com.hotnews.ssm.dao;

import com.hotnews.ssm.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/22.
 */
public interface NewsDao {

    List<News> queryNews(@Param("type")String type, @Param("page")int page, @Param("limit")int limit);

    String queryType(int id);

}
