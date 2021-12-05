package com.olalalao.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 00:23:17
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

