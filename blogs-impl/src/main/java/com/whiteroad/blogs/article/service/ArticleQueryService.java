package com.whiteroad.blogs.article.service;

import com.whiteroad.blogs.article.vo.ArticleVo;
import com.whiteroad.database.query.QuerySchema;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 15:03
 * 文章查询业务处理Service类
 */
public interface ArticleQueryService {

    /**
     * 查询全部文章
     * @return 文章分页集
     * @param querySchema 查询参数
     */
    Page<ArticleVo> queryList(QuerySchema querySchema);
}
