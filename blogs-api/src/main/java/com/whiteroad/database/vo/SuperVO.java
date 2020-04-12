package com.whiteroad.database.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Da
 * @date 2020/4/11 21:08
 * 前端交换对象基类
 */
public class SuperVO implements Serializable {
    /**
     * 是否删除. 0是未删除，1是标记删除.
     */
    protected int dr = IS_DELETE_NO;

    public final static int IS_DELETE_YES = 1;

    public final static int IS_DELETE_NO = 0;


    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }
    /** 时间戳，用于同步锁 */

    private Timestamp ts;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

}
