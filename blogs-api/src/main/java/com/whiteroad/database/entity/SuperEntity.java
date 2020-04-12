package com.whiteroad.database.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Da
 * @date 2020/4/11 21:03
 *
 * 基础实体基类
 *
 */
@MappedSuperclass
@SuppressWarnings("serial")
public class SuperEntity implements Serializable {
    /**
     * 是否删除. 0是未删除，1是标记删除.
     */
    protected int dr = IS_DELETE_NO;

    public final static int IS_DELETE_YES = 1;

    public final static int IS_DELETE_NO = 0;

    @Column(name = "DR")
    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }


}
