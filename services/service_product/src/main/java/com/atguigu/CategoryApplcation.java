package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 撸码的小孩 on 2020/11/27
 * time  19:13
 */
@SpringBootApplication
@MapperScan("com.atguigu.gmall.product.mapper")
public class CategoryApplcation {
    public static void main(String[] args) {
        SpringApplication.run(CategoryApplcation.class,args);
    }
}
