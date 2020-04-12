package com.whiteroad.blogs.password.service.impl;

import com.whiteroad.blogs.password.entity.PasswordEntity;
import com.whiteroad.blogs.password.repository.PasswordDao;
import com.whiteroad.blogs.password.service.PasswordQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Da
 * @date 2020/4/12 15:41
 * 管理员密码类数据查询操作实现类
 */
@Service
public class PasswordQueryServiceImpl implements PasswordQueryService {

    @Autowired
    private PasswordDao passwordDao;

    @Override
    public Boolean queryByCiphertext(String pswPassword) {

        byte[] pswPasswordBytes = pswPassword.getBytes();

        List<PasswordEntity> entityList = passwordDao.queryByCiphertext(pswPasswordBytes);

        return null;
    }
}
