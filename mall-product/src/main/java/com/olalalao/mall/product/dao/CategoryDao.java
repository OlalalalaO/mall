package com.olalalao.mall.product.dao;

import com.olalalao.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 17:30:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
