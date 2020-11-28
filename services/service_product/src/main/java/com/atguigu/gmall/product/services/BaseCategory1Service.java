package com.atguigu.gmall.product.services;



import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 撸码的小孩 on 2020/11/28
 * time  9:57
 */
@Component
public interface BaseCategory1Service {
    List<BaseCategory1> getCategory1();

    /**
     * 二级分类
     * @param category1Id
     * @return
     */
    List<BaseCategory2> getCategory2(Long category1Id);

    /**
     * 三级分类
     * @param category2Id
     * @return
     */
    List<BaseCategory3> getCategory3(Long category2Id);
}
