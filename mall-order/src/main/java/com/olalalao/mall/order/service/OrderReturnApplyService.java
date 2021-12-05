package com.olalalao.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 10:48:14
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

