package com.hotnews.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by AnonymousH on 2017/9/28.
 */

@Configuration
@EnableSwagger2
public class ApiSwaggerConfig {

    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hotnews.ssm.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder()
                .title("HotNews API Project")
                .description("HotNews API 说明文档")
                .termsOfServiceUrl("https://github.com/AnonymousH")
                .contact(new Contact("AnonymousH", "https://github.com/AnonymousH", ""))
                .version("1.0")
                .build();

    }

}
