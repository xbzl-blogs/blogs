package com.whiteroad.blogs.article.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whiteroad.blogs.article.entity.ArticleContentEntity;
import com.whiteroad.blogs.article.entity.ArticleTypeEnum;
import com.whiteroad.database.vo.SuperMainVO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 14:58
 */
public class ArticleVo extends SuperMainVO {

    private String id;

    //文章类型
    /**
     * 文章类型
     */
    private int articleType = ArticleTypeEnum.IMAGE;

    /**
     * 文章发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleTime;

    /**
     * 文章发布签名
     */
    private String articleUserName;

    /**
     * 内容标题
     */
    private String contentTitle;

    /**
     * 内容副标题
     */
    private String contentSubhead;

    /**
     * 内容标签
     */
    private String contentTags;

    /**
     * 内容分类
     */
    private String contentCategory;

    /**
     * 内容简介
     */
    private String contentIntro;

    /**
     * 内容子表
     */
    private List<ArticleContentVo> contents = new ArrayList<ArticleContentVo>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getArticleType() {
        return articleType;
    }

    public void setArticleType(int articleType) {
        this.articleType = articleType;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleUserName() {
        return articleUserName;
    }

    public void setArticleUserName(String articleUserName) {
        this.articleUserName = articleUserName;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentSubhead() {
        return contentSubhead;
    }

    public void setContentSubhead(String contentSubhead) {
        this.contentSubhead = contentSubhead;
    }

    public String getContentTags() {
        return contentTags;
    }

    public void setContentTags(String contentTags) {
        this.contentTags = contentTags;
    }

    public String getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(String contentCategory) {
        this.contentCategory = contentCategory;
    }

    public String getContentIntro() {
        return contentIntro;
    }

    public void setContentIntro(String contentIntro) {
        this.contentIntro = contentIntro;
    }

    public List<ArticleContentVo> getContents() {
        return contents;
    }

    public void setContents(List<ArticleContentVo> contents) {
        this.contents = contents;
    }
}
