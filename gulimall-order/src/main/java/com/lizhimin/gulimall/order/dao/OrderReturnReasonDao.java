package com.lizhimin.gulimall.order.dao;

import com.lizhimin.gulimall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:53
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
