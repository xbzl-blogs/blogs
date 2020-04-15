package com.whiteroad.blogs.article.entity;

import com.whiteroad.database.entity.SuperMainEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 14:00
 * 文章实体类
 */
@Entity
@Table(name = "article")
public class ArticleEntity extends SuperMainEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 32)
    private String id;

    /**
     * 文章类型
     */
    @Column(name = "article_type")
    private int articleType = ArticleTypeEnum.IMAGE;

    /**
     * 文章发布时间
     */
    @Column(name = "article_time")
    private Date articleTime;

    /**
     * 文章发布签名
     */
    @Column(name = "article_user_name")
    private String articleUserName;

    /**
     * 内容标题
     */
    @Column(name = "content_tilte")
    private String contentTitle;

    /**
     * 内容副标题
     */
    @Column(name = "content_subhead")
    private String contentSubhead;

    /**
     * 内容标签
     */
    @Column(name = "content_tags")
    private String contentTags;

    /**
     * 内容分类
     */
    @Column(name = "content_catefory")
    private String contentCategory;

    /**
     * 内容简介
     */
    @Column(name = "content_intro")
    private String contentIntro;

    /**
     * 内容子表
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "parent")
    private List<ArticleContentEntity> contents = new ArrayList<ArticleContentEntity>();

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

    public List<ArticleContentEntity> getContents() {
        return contents;
    }

    public void setContents(List<ArticleContentEntity> contents) {
        this.contents = contents;
    }
}
