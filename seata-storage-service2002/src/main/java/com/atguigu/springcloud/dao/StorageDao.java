package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lynch
 * @date 2020/4/9 14:39
 */
@Mapper
public interface StorageDao {
    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}