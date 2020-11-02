package com.lizhimin.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:23:54
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

