package com.github.gudian1618.cgb2011spboot02.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 3:15 下午
 */

@SpringBootTest
public class SqlSessionTests {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testDeleteById() {
        // 1.创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // System.out.println(sqlSession.getConnection());
        // 2.执行会话操作
        GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
        int rows = goodsDao.deleteById(100);
        System.out.println("rows=" + rows);
        sqlSession.commit();
        // 3.释放资源
        sqlSession.close();

    }

}
