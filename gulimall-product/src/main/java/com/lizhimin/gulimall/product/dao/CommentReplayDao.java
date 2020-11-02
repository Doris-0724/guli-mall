package com.lizhimin.gulimall.product.dao;

import com.lizhimin.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lizhimin
 * @email leifengyang@gmail.com
 * @date 2020-10-30 15:41:08
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
