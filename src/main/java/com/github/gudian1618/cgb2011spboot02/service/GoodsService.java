package com.github.gudian1618.cgb2011spboot02.service;

import com.github.gudian1618.cgb2011spboot02.pojo.Goods;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 7:15 下午
 */

public interface GoodsService {

    List<Goods> findGoods();

    int deleteById(Long id);

    int saveGoods(Goods entity);

}
