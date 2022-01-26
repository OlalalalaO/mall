package com.olalalao.mall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.common.utils.Query;

import com.olalalao.mall.product.dao.CategoryDao;
import com.olalalao.mall.product.entity.CategoryEntity;
import com.olalalao.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryService service;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    public List<CategoryEntity> findList() {
        return service.list();
    }

    public void getCategoryTree(CategoryEntity category, List<CategoryEntity> categoryList) {
        List<CategoryEntity> children = categoryList.stream().filter(it -> it.getParentCid().equals(category.getCatId())).collect(Collectors.toList());
        if (children.size() != 0) {
            category.setChildren(children);
            children.forEach(it -> getCategoryTree(it, categoryList));
        }
    }
}