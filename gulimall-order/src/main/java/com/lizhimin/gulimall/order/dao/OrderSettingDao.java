package com.lizhimin.gulimall.order.dao;

import com.lizhimin.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:53
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
