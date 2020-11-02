package com.lizhimin.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:26:57
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

