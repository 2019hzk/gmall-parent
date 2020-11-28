package com.atguigu.gmall.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 撸码的小孩 on 2020/11/27
 * time  17:38
 */
@RestController
@RequestMapping("/api/test")
public class SpringApiTestController {
    @GetMapping("/serviceTest")
    public  String  serviceTest(){
       return "hello";
    }

}
