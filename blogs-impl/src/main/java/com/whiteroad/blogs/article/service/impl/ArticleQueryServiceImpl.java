package com.whiteroad.blogs.article.service.impl;

import com.whiteroad.blogs.article.entity.ArticleEntity;
import com.whiteroad.blogs.article.repository.ArticleDao;
import com.whiteroad.blogs.article.service.ArticleQueryService;
import com.whiteroad.blogs.article.utils.ArticleDataUtils;
import com.whiteroad.blogs.article.vo.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 15:03
 * 文章查询业务接口实现类
 */
@Service
public class ArticleQueryServiceImpl implements ArticleQueryService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<ArticleVo> queryList() {
        List<ArticleVo> backVos = new ArrayList<>();
        List<ArticleEntity> articleEntities = articleDao.queryAllArticle();
        for (ArticleEntity entity : articleEntities){
            ArticleVo vo = new ArticleVo();
            ArticleDataUtils.copyEntityToVO(entity,vo);
            backVos.add(vo);
        }
        return backVos;
    }
}
