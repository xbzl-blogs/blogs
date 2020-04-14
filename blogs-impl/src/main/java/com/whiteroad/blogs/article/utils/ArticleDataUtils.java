package com.whiteroad.blogs.article.utils;

import com.whiteroad.blogs.article.entity.ArticleContentEntity;
import com.whiteroad.blogs.article.entity.ArticleEntity;
import com.whiteroad.blogs.article.vo.ArticleContentVo;
import com.whiteroad.blogs.article.vo.ArticleVo;
import com.whiteroad.blogs.password.entity.PasswordEntity;
import com.whiteroad.blogs.password.vo.PasswordVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 15:12
 */
public class ArticleDataUtils {

    public static void copyEntityToVO(ArticleEntity entity, ArticleVo vo){
        if (entity == null){
            return;
        }
        List<ArticleContentEntity> contents = entity.getContents();
        List<ArticleContentVo> contentVos = new ArrayList<>();
        for (ArticleContentEntity contentEntity : contents){
            ArticleContentVo contentVo = new ArticleContentVo();
            BeanUtils.copyProperties(contentEntity,contentVo);
            contentVos.add(contentVo);
        }
        BeanUtils.copyProperties(entity,vo);
        vo.setContents(contentVos);
    }
}
