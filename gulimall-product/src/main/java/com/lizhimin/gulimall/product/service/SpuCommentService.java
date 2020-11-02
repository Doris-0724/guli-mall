package com.lizhimin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lizhimin
 * @email leifengyang@gmail.com
 * @date 2020-10-30 15:41:08
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

