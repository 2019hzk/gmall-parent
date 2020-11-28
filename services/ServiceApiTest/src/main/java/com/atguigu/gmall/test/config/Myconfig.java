package com.atguigu.gmall.test.config;

/**
 * Created by 撸码的小孩 on 2020/11/27
 * time  18:27
 */



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by 撸码的小孩 on 2020/10/31
 * time  15:23
 */
@Configuration
@EnableSwagger2
public class Myconfig {
    @Bean
    public Docket webApiConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .build();
    }


    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("网站-测试API文档")
                .description("本文档描述了测试管理微服务接口定义")
                .version("1.0")
                .contact(new Contact("Helen", "http://atguigu.com", "55317332@qq.com"))
                .build();
    }



}








