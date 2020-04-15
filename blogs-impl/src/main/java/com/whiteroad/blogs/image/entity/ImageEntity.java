package com.whiteroad.blogs.image.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whiteroad.blogs.article.entity.ArticleEntity;
import com.whiteroad.database.entity.SuperMainEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Da
 * @date 2020/4/15 11:22
 * 图片库实体类
 * 用于存储所有图片库内的图片的物理存储位置
 */
@Entity
@Table(name = "image")
public class ImageEntity extends SuperMainEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 32)
    private String id;

    /**
     * 物理路径
     */
    @Column(name = "path")
    private String path;

    /**
     * 图片名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 图片类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 图片信息，备注之类的
     */
    @Column(name = "message")
    private String message;

    /**
     * 图片所属
     */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "parentid", insertable = false, updatable = false)
    private ArticleEntity parent;

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
