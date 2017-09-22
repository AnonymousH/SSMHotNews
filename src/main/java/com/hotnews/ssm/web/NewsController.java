package com.hotnews.ssm.web;

import com.hotnews.ssm.dto.ResponsTemplate;
import com.hotnews.ssm.entity.News;
import com.hotnews.ssm.service.NewsService;
import com.hotnews.ssm.util.JsonUtil;
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
public class NewsController {

    @Autowired
    private NewsService newsService;

    @ResponseBody
    @RequestMapping(value = "/getNews", method = RequestMethod.GET)
    public ResponsTemplate<List<News>> getNews(String type, int page, int limit) {
        List<News> newsList = newsService.getNews(type, page, limit);
        return JsonUtil.getJsonResult(newsList,1,"");
    }

}
