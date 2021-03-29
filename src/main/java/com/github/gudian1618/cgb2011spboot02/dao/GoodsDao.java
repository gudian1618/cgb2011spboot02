package com.github.gudian1618.cgb2011spboot02.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/29 2:18 下午
 * Dao:数据访问对象
 * 商品表对象的数据访问对象
 * @Mapper 注解用于描述数据层接口,有mybatis框架定义,系统底层会为其创建实现类,
 * 并且会创建其实现类对象然后交给spring框架容器管理
 */

@Mapper
public interface GoodsDao {

    /**
     * 基于id执行商品数据的删除
     */
    @Delete("delete from tb_goods where id=#{id}")
    int deleteById(Integer id);

}
