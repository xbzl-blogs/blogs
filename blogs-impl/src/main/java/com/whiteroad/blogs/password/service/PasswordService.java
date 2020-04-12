package com.whiteroad.blogs.password.service;

import com.whiteroad.blogs.password.vo.PasswordVo;

import java.util.List;

/**
 * @author Da
 * @date 2020/4/11 16:24
 * 管理员密码Service接口
 */
public interface PasswordService {

    List<PasswordVo> insertInit();
}
