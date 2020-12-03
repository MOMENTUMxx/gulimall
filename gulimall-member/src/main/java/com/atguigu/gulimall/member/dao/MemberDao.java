package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author LujieWang
 * @email wanglujiexx@gmail.com
 * @date 2020-10-29 17:00:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
