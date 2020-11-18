package com.lizhimin.gulimall.product.service.impl;

import com.lizhimin.gulimall.product.entity.CategoryEntity;
import com.lizhimin.gulimall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CategoryServiceImplTest {
    @Autowired
    CategoryService categoryService;
    @Test
    public void test(){
        List<CategoryEntity> list = categoryService.listwithTree();
        System.out.println("============"+list);

    }

}