package com.lizhimin.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:26:57
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

