package com.lizhimin.gulimall.order.dao;

import com.lizhimin.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
