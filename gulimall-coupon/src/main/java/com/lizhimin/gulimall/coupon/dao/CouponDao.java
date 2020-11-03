package com.lizhimin.gulimall.coupon.dao;

import com.lizhimin.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:18:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
