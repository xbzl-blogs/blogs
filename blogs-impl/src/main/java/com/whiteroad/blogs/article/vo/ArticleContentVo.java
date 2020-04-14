package com.whiteroad.blogs.article.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whiteroad.blogs.article.entity.ArticleEntity;
import com.whiteroad.blogs.article.entity.ContentTypeEnum;
import com.whiteroad.database.vo.SuperSubVO;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Da
 * @date 2020/4/14 14:59
 */
public class ArticleContentVo extends SuperSubVO {

    private String id;

    private ArticleVo parent;

    private String parentid;

    //内容类型
    private int type = ContentTypeEnum.TEXT;

    //内容
    private String content;

    //排序
    private int sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArticleVo getParent() {
        return parent;
    }

    public void setParent(ArticleVo parent) {
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
