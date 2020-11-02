package com.lizhimin.gulimall.product.dao;

import com.lizhimin.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lizhimin
 * @email leifengyang@gmail.com
 * @date 2020-10-30 15:41:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
