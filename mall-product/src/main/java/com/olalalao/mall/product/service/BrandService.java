package com.olalalao.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-04 22:37:07
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

