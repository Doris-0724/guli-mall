package com.lizhimin.gulimall.product;
//
//import com.aliyun.oss.OSSClient;

import com.lizhimin.gulimall.product.entity.BrandEntity;
import com.lizhimin.gulimall.product.service.BrandService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.InputStream;


@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;


//    @Autowired
//    private OSSClient ossClient;

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为");
        brandEntity.setFirstLetter("2");
        brandEntity.setLogo("huaiwei");

        brandService.save(brandEntity);
        System.out.println("保存成功。。。。。。。。");
    }
//
//    @Test
//    void contextLoads() {
//
//        try {
//            InputStream inputStream = new FileInputStream("/Users/zhiminli/Downloads/book/01.jpeg");
//            ossClient.putObject("sawlizhimin", "gulimall/product/01.jpeg", inputStream);
//
//            ossClient.shutdown();
//            System.out.println("上传成功");
//        }catch (Exception e ){
//            System.out.println(e);
//        }
//
//    }

}
