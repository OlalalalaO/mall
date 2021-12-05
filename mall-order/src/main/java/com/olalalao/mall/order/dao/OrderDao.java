package com.olalalao.mall.order.dao;

import com.olalalao.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 10:48:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
