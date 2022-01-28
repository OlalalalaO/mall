package com.olalalao.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.olalalao.mall.product.service.impl.CategoryServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olalalao.mall.product.entity.CategoryEntity;
import com.olalalao.mall.product.service.CategoryService;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.common.utils.R;


/**
 * 商品三级分类
 *
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 17:30:47
 */
@RestController
@RequestMapping("/product/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl service;

    /**
     * 查处所有的分类以及子分类
     */
    @RequestMapping("/list/tree")
    public List<CategoryEntity> list(@RequestParam Map<String, Object> params) {
        List<CategoryEntity> parent = service.list();
        List<CategoryEntity> highLevelCate = parent.stream().filter(it -> (it.getParentCid() == 0)).collect(Collectors.toList());
        highLevelCate.forEach(it -> service.getCategoryTree(it, parent));
        return highLevelCate;
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = service.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        service.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        service.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public R delete(@RequestBody String catIds) {
        List<Long> catIdArray = JSONArray.parseArray(catIds, Long.class);
        //TODO
        service.removeMenuByIds(catIdArray);
        return R.ok();
    }


}
