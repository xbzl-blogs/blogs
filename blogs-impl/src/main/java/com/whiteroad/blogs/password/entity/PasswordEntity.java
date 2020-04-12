package com.whiteroad.blogs.password.entity;

import com.whiteroad.database.entity.SuperMainEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/11 12:20
 * 密码实体
 * 用于管理员登录使用密码
 */

@Entity
@Table(name = "password")
public class PasswordEntity extends SuperMainEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false, length = 32)
    private String id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "parent")
    private List<PasswordRecordEntity> records = new ArrayList<PasswordRecordEntity>(0);

    @Column(name = "psw_ciphertext")
    private byte[] pswCiphertext;

    @Column(name = "psw_user_name")
    private String pswUserName;

    @Column(name = "psw_user_id")
    private String pswUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PasswordRecordEntity> getRecords() {
        return records;
    }

    public void setRecords(List<PasswordRecordEntity> records) {
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
