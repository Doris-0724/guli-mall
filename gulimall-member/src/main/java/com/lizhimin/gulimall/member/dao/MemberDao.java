package com.lizhimin.gulimall.member.dao;

import com.lizhimin.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:22:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
