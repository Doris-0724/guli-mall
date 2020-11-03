package com.lizhimin.gulimall.product;

import com.lizhimin.gulimall.product.entity.BrandEntity;
import com.lizhimin.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为");
        brandEntity.setFirstLetter("2");
        brandEntity.setLogo("huaiwei");

        brandService.save(brandEntity);
        System.out.println("保存成功。。。。。。。。");
    }

    @Test
    void contextLoads() {

    }

}
