package com.whiteroad.database.entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.sql.Timestamp;

/**
 * @author Da
 * @date 2020/4/11 21:07
 * 子表实体基类
 */
@MappedSuperclass
public class SuperSubEntity extends SuperEntity{
    /**
     * 子表行状态
     */
    @Transient
    private String rowState;

    /** 时间戳，用于同步锁 */
    private Timestamp ts;

    public String getRowState() {
        return rowState;
    }

    public void setRowState(String rowState) {
        this.rowState = rowState;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }
}
