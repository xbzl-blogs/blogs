package com.whiteroad.blogs.password.utils;

import com.whiteroad.blogs.password.entity.PasswordEntity;
import com.whiteroad.blogs.password.vo.PasswordVo;

/**
 * @author Da
 * @date 2020/4/11 22:13
 */
public class PasswordDataUtils {

    public static void copyEntityToVO(PasswordEntity entity,PasswordVo vo){
        vo.setId(entity.getId());
        vo.setPswCiphertext(entity.getPswCiphertext());
        vo.setPswUserName(entity.getPswUserName());
    }
}
