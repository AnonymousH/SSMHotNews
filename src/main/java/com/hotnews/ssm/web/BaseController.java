package com.hotnews.ssm.web;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by AnonymousH on 2017/10/25.
 */
public class BaseController {

    protected String devicePlatform;
    protected String appVersion;
    protected String salePlatformId;
    protected String token;
    protected String api_userId;

    /**
     * 执行此方法对 Header参数进行赋值
     *
     * @param request
     */
    protected void getHeaderParams(HttpServletRequest request) {
        devicePlatform = request.getHeader("devicePlatform") == null ? "" : request.getHeader("devicePlatform");
        appVersion = request.getHeader("appVersion") == null ? "" : request.getHeader("appVersion");
        salePlatformId = request.getHeader("salePlatformId") == null ? "" : request.getHeader("salePlatformId");
        token = request.getHeader("token") == null ? "" : request.getHeader("token");
        api_userId = request.getHeader("api_userId") == null ? "" : request.getHeader("api_userId");
    }

}
