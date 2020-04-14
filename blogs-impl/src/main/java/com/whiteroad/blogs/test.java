package com.whiteroad.blogs;

import com.whiteroad.blogs.article.entity.ArticleEntity;
import com.whiteroad.blogs.article.entity.ArticleTypeEnum;

/**
 * @author Da
 * @date 2020/4/14 14:56
 */
public class test {

    public static void main(String[] args) {
        ArticleEntity entity = new ArticleEntity();

        entity.setArticleType(ArticleTypeEnum.IMAGE);
        System.out.println(entity.getArticleType());
    }
}
