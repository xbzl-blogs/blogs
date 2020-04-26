package com.whiteroad.blogs.article.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whiteroad.database.entity.SuperSubEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Da
 * @date 2020/4/14 14:39
 * 文章实体类-内容子表实体类
 */
@Entity
@Table(name = "article_content")
public class ArticleContentEntity extends SuperSubEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 32)
    private String id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "parentid", insertable = false, updatable = false)
    private ArticleEntity parent;

    @Column(name = "parentid")
    private String parentid;

    /**
     * 内容类型
     * 4、5分类只有一个
     */
    @Column(name = "type")
    private int type = ContentTypeEnum.TEXT;

    /**
     * 内容
     * 如果是图片IMAGE类型内容或者封面媒体MEDIA类型，则存储图片或视频地址
     * 如果是标题HEADER类型内容，则存储以'<header/>'为间隔符则内容，顺序为标题、作者、时间、内容分类(','逗号分隔,最多两个)
     * 如果是引用BLOCKQUOTE类型内容，则存储以'<blockquote/>'为间隔符分割内容，顺序为内容、作者或者时间或者地点或者书名
     * 如果是标签TAGS类型内容，则存储以'<a/>'为间隔符分割的内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 排序
     */
    @Column(name = "sort")
    private int sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArticleEntity getParent() {
        return parent;
    }

    public void setParent(ArticleEntity parent) {
        this.parent = parent;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
