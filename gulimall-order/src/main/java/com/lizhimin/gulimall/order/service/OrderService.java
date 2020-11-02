package com.lizhimin.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:54
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

