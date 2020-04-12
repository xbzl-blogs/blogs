package com.whiteroad.blogs.password.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whiteroad.database.entity.SuperSubEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Da
 * @date 2020/4/11 15:22
 * 密码实体-子表登录记录实体
 * 用于存储管理员登录记录
 */
@Entity
@Table(name = "password_record")
public class PasswordRecordEntity extends SuperSubEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 32)
    private String id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "parentid", insertable = false, updatable = false)
    private PasswordEntity parent;

    private String parentid;

    @Column(name = "login_time")
    private Date loginTime;

    @Column(name = "login_ip")
    private String loginIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PasswordEntity getParent() {
        return parent;
    }

    public void setParent(PasswordEntity parent) {
        this.parent = parent;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
