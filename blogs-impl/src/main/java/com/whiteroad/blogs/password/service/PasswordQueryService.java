package com.whiteroad.blogs.password.service;

/**
 * @author Da
 * @date 2020/4/12 15:39
 * 管理员密码Service接口
 * 用于查询数据使用的Service
 */
public interface PasswordQueryService {
    /**
     * 查询管理员密码是否存在
     * @param pswPassword 密码
     * @return 密码是否正确，true为正确 false为未查到
     */
    Boolean queryByCiphertext(String pswPassword);
}
