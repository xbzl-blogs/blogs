package com.whiteroad.blogs.article.repository;

import com.whiteroad.blogs.article.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 15:04
 */
@Repository
public interface ArticleDao
        extends JpaRepository<ArticleEntity, Serializable> {

    /**
     * 查询全部文章
     * @return 文章集
     */
    @Query("SELECT a FROM ArticleEntity a WHERE a.dr = 0 ")
    List<ArticleEntity> queryAllArticle();
}
