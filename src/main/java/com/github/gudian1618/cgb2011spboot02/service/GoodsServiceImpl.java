package com.github.gudian1618.cgb2011spboot02.service;

import com.github.gudian1618.cgb2011spboot02.dao.GoodsDao;
import com.github.gudian1618.cgb2011spboot02.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 7:18 下午
 * 商品业务层对象,负责业务逻辑处理
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    // has a
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findGoods() {
        long start = System.currentTimeMillis();
        List<Goods> list = goodsDao.findObjects();
        long end = System.currentTimeMillis();
        System.out.println("query time:" + (end - start));
        return list;
    }
}
