package com.lizhimin.gulimall.member.dao;

import com.lizhimin.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:22:12
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
