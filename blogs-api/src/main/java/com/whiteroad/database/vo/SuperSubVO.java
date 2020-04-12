package com.whiteroad.database.vo;

/**
 * @author Da
 * @date 2020/4/11 21:11
 * 子实体对外VO基类
 */
public class SuperSubVO extends SuperVO{
    /**
     * 子表行状态
     */
    private String rowState;

    public String getRowState() {
        return rowState;
    }

    public void setRowState(String rowState) {
        this.rowState = rowState;
    }
}
