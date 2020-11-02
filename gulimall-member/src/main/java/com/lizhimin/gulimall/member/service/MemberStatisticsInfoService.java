package com.lizhimin.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lizhimin.common.utils.PageUtils;
import com.lizhimin.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author lizhimin
 * @email lizhimin@gmail.com
 * @date 2020-10-30 17:22:12
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

