package com.github.gudian1618.cgb2011spboot02.dao;

import com.github.gudian1618.cgb2011spboot02.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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
     * 查询所有商品信息
     * @return
     */
    @Select("select id,name,remark,createdTime from tb_goods")
    List<Goods> findObjects();

    /**
     * 基于多个id删除商品信息
     * 方法参数是可变参数或数组时,在sql映射中可以使用 array 变量接收参数数据
     * 假如不希望使用array,想另外自定义参数变量名,可以借助 @Param 注解在接口方法中对参数进行描述
     * @param ids
     * @return
     */
    int deleteObjects(@Param("ids") Integer... ids);

    /**
     * 基于id执行商品数据的删除
     */
    @Delete("delete from tb_goods where id=#{id}")
    int deleteById(Integer id);

}
