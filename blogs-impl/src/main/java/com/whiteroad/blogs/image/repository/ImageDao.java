package com.whiteroad.blogs.image.repository;

import com.whiteroad.blogs.image.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;

/**
 * @author Da
 * @date 2020/4/15 11:44
 * 图片库数据库查询jpa接口
 */
public interface ImageDao extends JpaRepository<ImageEntity, Serializable> {

    /**
     * 通过图片id查询图片地址
     * @param id 图片id
     * @return 图片实体
     */
    @Query(value = "SELECT i FROM ImageEntity i WHERE i.dr = 0 AND i.id = :id")
    ImageEntity findOneById(@Param("id") String id);
}
