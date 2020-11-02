package com.lizhimin.gulimall.order.dao;

import com.lizhimin.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:54
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
