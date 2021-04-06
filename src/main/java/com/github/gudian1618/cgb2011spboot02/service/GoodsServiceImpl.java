package com.github.gudian1618.cgb2011spboot02.service;

import com.github.gudian1618.cgb2011spboot02.dao.GoodsDao;
import com.github.gudian1618.cgb2011spboot02.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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
    public int deleteById(Long id) {
        int rows = 0;
        if (id == null || id < 1) {
            throw new IllegalArgumentException("id值无效");
        }
        rows = goodsDao.deleteById(id);
        if (rows==0) {
            throw new NoSuchElementException("记录可能已经不存在了");
        }
        return rows;
    }

    @Override
    public List<Goods> findGoods() {
        long start = System.currentTimeMillis();
        List<Goods> list = goodsDao.findObjects();
        long end = System.currentTimeMillis();
        System.out.println("query time:" + (end - start));
        return list;
    }
}
