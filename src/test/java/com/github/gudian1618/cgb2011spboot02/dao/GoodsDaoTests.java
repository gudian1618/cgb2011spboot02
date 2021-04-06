package com.github.gudian1618.cgb2011spboot02.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 2:24 下午
 */

@SpringBootTest
public class GoodsDaoTests {

    // has a
    @Autowired
    private GoodsDao goodsDao;

    @Test
    void testDeleteById() {
        int rows = goodsDao.deleteById(100L );
        System.out.println("rows=" + rows);
    }

    @Test
    void testDeleteObjects() {
        // int rows = goodsDao.deleteObjects(1000, 2000);
        int rows = goodsDao.deleteObjects();
        System.out.println("rows=" + rows);
    }

}
