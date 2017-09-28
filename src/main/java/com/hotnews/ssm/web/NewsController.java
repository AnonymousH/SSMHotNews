package com.hotnews.ssm.web;

import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.entity.Category;
import com.hotnews.ssm.entity.News;
import com.hotnews.ssm.service.NewsService;
import com.hotnews.ssm.util.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by AnonymousH on 2017/9/22.
 */
@Controller
@RequestMapping("/news")
@Api(tags = "News" , value = "/news", description = "获取相关新闻")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "获取新闻列表", notes = "获取新闻列表", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "类别", required = true, dataType = "String"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "int"),
            @ApiImplicitParam(name = "limit", value = "每页数量", required = true, dataType = "int")
    })
    @ResponseBody
    @RequestMapping(value = "/getNews", method = RequestMethod.GET)
    public ResponsTemplate<List<News>> getNews(String type, int page, int limit) {
        List<News> newsList = newsService.getNews(type, page, limit);
        return JsonUtil.getJsonResult(newsList,1,"");
    }

    @ApiOperation(value = "获取新闻所有类别", notes = "获取新闻所有类别", httpMethod = "GET")
    @ResponseBody
    @RequestMapping(value = "/getAllCategroy", method = RequestMethod.GET)
    public List<Category> getCategoryType () {
        return newsService.getType();
    }



}
