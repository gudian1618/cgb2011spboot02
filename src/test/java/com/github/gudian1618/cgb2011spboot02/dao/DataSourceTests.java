package com.github.gudian1618.cgb2011spboot02.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/23 10:18 下午
 */

@SpringBootTest
public class DataSourceTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testGetConnection() throws SQLException {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }

}
