package com.lizhimin.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Autowired
    private OSSClient ossClient;

    @Test
    void contextLoads() {
    }
    @Test
    void contextLoads1() {

        try {
            InputStream inputStream = new FileInputStream("/Users/zhiminli/Downloads/book/01.jpeg");
            ossClient.putObject("sawlizhimin", "gulimall/product/02.jpeg", inputStream);

            ossClient.shutdown();
            System.out.println("上传成功");
        }catch (Exception e ){
            System.out.println(e);
        }

    }


}
