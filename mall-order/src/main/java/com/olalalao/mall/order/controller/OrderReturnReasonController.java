package com.olalalao.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olalalao.mall.order.entity.OrderReturnReasonEntity;
import com.olalalao.mall.order.service.OrderReturnReasonService;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.common.utils.R;



/**
 * 退货原因
 *
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 10:48:14
 */
@RestController
@RequestMapping("order/orderreturnreason")
public class OrderReturnReasonController {
    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:orderreturnreason:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderReturnReasonService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:orderreturnreason:info")
    public R info(@PathVariable("id") Long id){
		OrderReturnReasonEntity orderReturnReason = orderReturnReasonService.getById(id);

        return R.ok().put("orderReturnReason", orderReturnReason);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:orderreturnreason:save")
    public R save(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.save(orderReturnReason);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:orderreturnreason:update")
    public R update(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.updateById(orderReturnReason);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:orderreturnreason:delete")
    public R delete(@RequestBody Long[] ids){
		orderReturnReasonService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}