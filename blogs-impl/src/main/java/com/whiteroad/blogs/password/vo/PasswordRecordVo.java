package com.whiteroad.blogs.password.vo;

import com.whiteroad.blogs.password.entity.PasswordEntity;
import com.whiteroad.database.vo.SuperSubVO;

import java.util.Date;

/**
 * @author Da
 * @date 2020/4/11 15:32
 */
public class PasswordRecordVo extends SuperSubVO {

    private String id;

    private PasswordEntity parent;

    private String parentid;

    private Date loginTime;

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
