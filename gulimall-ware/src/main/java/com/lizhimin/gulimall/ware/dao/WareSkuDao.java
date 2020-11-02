package com.lizhimin.gulimall.ware.dao;

import com.lizhimin.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:26:56
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
