package com.atguigu.gmall.product.services.impl;


import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory2Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory3Mapper;
import com.atguigu.gmall.product.services.BaseCategory1Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 撸码的小孩 on 2020/11/28
 * time  10:00
 */
@Component
public class BaseCategory1ServiceImpl implements BaseCategory1Service {
   @Autowired
   private BaseCategory1Mapper baseCategory1Mapper;
    @Autowired
    private BaseCategory2Mapper baseCategory2Mapper;
    @Autowired
    private BaseCategory3Mapper baseCategory3Mapper;
    @Override
    public List<BaseCategory1> getCategory1() {
        List<BaseCategory1> BaseCategory1s = baseCategory1Mapper.selectList(null);
        return BaseCategory1s;
    }
   //二级分类
    @Override
    public List<BaseCategory2> getCategory2(Long category1Id) {

        QueryWrapper<BaseCategory2> queryWrapper=new QueryWrapper();
        queryWrapper.eq("category1_id",category1Id);
        List<BaseCategory2> BaseCategory2s = baseCategory2Mapper.selectList(queryWrapper);
        return BaseCategory2s;

    }
   //三级分类
    @Override
    public List<BaseCategory3> getCategory3(Long category2Id) {
        QueryWrapper<BaseCategory3> queryWrapper=new QueryWrapper();
        queryWrapper.eq("category2_id",category2Id);
        List<BaseCategory3> BaseCategory3s = baseCategory3Mapper.selectList(queryWrapper);
        return BaseCategory3s;
    }
}
