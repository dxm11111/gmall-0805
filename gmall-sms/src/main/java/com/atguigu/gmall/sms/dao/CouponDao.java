package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author duxuemei
 * @email lxf@atguigu.com
 * @date 2020-01-07 21:10:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
