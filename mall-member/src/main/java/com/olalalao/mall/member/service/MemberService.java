package com.olalalao.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.olalalao.common.utils.PageUtils;
import com.olalalao.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zzx
 * @email 1176328868@qq.com
 * @date 2021-12-05 11:20:32
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

