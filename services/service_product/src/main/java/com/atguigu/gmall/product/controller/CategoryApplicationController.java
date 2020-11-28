package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import com.atguigu.gmall.product.services.BaseCategory1Service;
import com.atguigu.gmall.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 撸码的小孩 on 2020/11/27
 * time  19:01
 */
@RestController
@RequestMapping("/admin/product")
@CrossOrigin
public class CategoryApplicationController {
    @Autowired
    private BaseCategory1Service baseCategory1Service;
    //一级分类
    @GetMapping("/getCategory1")
    public Result getCategory1(){
     List<BaseCategory1> restult=baseCategory1Service.getCategory1();
     return Result.ok(restult);
    }
     //二级分类
     @GetMapping("/getCategory2/{category1Id}")
     public Result getCategory2(@PathVariable(value = "category1Id") Long category1Id ){
         List<BaseCategory2> restult2=baseCategory1Service.getCategory2(category1Id);
         return Result.ok(restult2);
     }
    //三级分类
    @GetMapping("/getCategory3/{category2Id}")
    public Result getCategory3(@PathVariable(value = "category2Id") Long category2Id ){
        List<BaseCategory3> restult3=baseCategory1Service.getCategory3(category2Id);
        return Result.ok(restult3);
    }

}
