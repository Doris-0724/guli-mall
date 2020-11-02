package com.lizhimin.gulimall.order.dao;

import com.lizhimin.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:54
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
