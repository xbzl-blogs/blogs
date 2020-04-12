package com.whiteroad.blogs.password.service;

import com.whiteroad.blogs.password.vo.PasswordVo;

import java.util.List;

/**
 * @author Da
 * @date 2020/4/11 16:24
 * 管理员密码Service接口
 * 用于操作修改数据使用的Service
 */
public interface PasswordService {

    /**
     * 初始化数据，使用默认信息进行初始化管理员账户密码
     * @return 初始化结果集
     */
    List<PasswordVo> insertInit();
}
