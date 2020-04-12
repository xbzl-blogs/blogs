package com.whiteroad.blogs.password.vo;

import com.whiteroad.database.vo.SuperMainVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/11 12:20
 */
public class PasswordVo extends SuperMainVO {

    private String id;

    private List<PasswordRecordVo> records = new ArrayList<PasswordRecordVo>(0);

    private byte[] pswCiphertext;

    private String pswUserName;

    private String pswUserId;

    private String pswPassword;

    public String getPswPassword() {
        return pswPassword;
    }

    public void setPswPassword(String pswPassword) {
        this.pswPassword = pswPassword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PasswordRecordVo> getRecords() {
        return records;
    }

    public void setRecords(List<PasswordRecordVo> records) {
        this.records = records;
    }

    public byte[] getPswCiphertext() {
        return pswCiphertext;
    }

    public void setPswCiphertext(byte[] pswCiphertext) {
        this.pswCiphertext = pswCiphertext;
    }

    public String getPswUserName() {
        return pswUserName;
    }

    public void setPswUserName(String pswUserName) {
        this.pswUserName = pswUserName;
    }

    public String getPswUserId() {
        return pswUserId;
    }

    public void setPswUserId(String pswUserId) {
        this.pswUserId = pswUserId;
    }
}
