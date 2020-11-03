package com.lizhimin.gulimall.member.feign;

import com.lizhimin.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 想要调用别的远程服务
 * 1）引入open-feign
 * 2）编写一个接口，告诉springCloud 这个接口需要调用远程服务
 * 3）开启远程调用的功能
 * */
@FeignClient("gulimall-coupon")
public interface CouponfeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();
}
