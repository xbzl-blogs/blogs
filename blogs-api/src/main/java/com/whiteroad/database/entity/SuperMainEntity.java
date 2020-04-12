package com.whiteroad.database.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Da
 * @date 2020/4/11 21:05
 *
 * 业务主实体继承类
 */
@MappedSuperclass
public class SuperMainEntity extends SuperEntity {

    /** 创建人id */
    private String creatorid;

    /** 创建人 */
    private String creator;

    /** 创建时间 */
    private Date createtime;

    /** 修改人id */
    private String modifierid;

    /** 修改人 */
    private String modifier;

    /**
     * 修改时间,记录修改的最后时间.
     */
    private Date modifytime;

    /** 时间戳，用于同步锁 */
    private Timestamp ts;

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }
}
