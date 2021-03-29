package com.github.gudian1618.cgb2011spboot02.service;

import com.github.gudian1618.cgb2011spboot02.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 7:24 下午
 */

@SpringBootTest
public class GoodsServiceTests {

    // has a
    @Autowired
    private GoodsService goodsService;

    @Test
    public void testFindGoods() {
        List<Goods> list = goodsService.findGoods();
        for (Goods g : list) {
            System.out.println(g);
        }
        // 业务层第一次查询和之后的查询时间性能差距很大
        // list = goodsService.findGoods();
    }
}
