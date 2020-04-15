package com.whiteroad.blogs.image.vo;

import com.whiteroad.blogs.article.entity.ArticleEntity;
import com.whiteroad.database.vo.SuperMainVO;


/**
 * @author Da
 * @date 2020/4/15 11:37
 * 图片库vo
 */
public class ImageVo extends SuperMainVO {

    private String id;

    /**
     * 物理路径
     */
    private String path;

    /**
     * 图片信息，备注之类的
     */
    private String message;

    /**
     * 图片所属
     */
    private ArticleEntity parent;

    /**
     * 图片名称
     */
    private String name;

    /**
     * 图片类型
     */
    private String type;

    private String parentid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
