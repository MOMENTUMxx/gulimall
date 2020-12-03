package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author LujieWang
 * @email wanglujiexx@gmail.com
 * @date 2020-10-28 16:16:04
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
