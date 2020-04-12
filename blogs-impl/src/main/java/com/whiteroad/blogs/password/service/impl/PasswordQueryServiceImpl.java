package com.whiteroad.blogs.password.service.impl;

import com.whiteroad.blogs.password.entity.PasswordEntity;
import com.whiteroad.blogs.password.repository.PasswordDao;
import com.whiteroad.blogs.password.service.PasswordQueryService;
import com.whiteroad.utils.WhiteroadShaMessageDigest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        Boolean flag = false;
        byte[] shaCiphertext = WhiteroadShaMessageDigest.getShaCiphertext(pswPassword);
        /**
         * 对比数据，查询全部管理员密码及拥有者，判断登录密码是否存在于查询结果，
         * 由于管理员密码很少，取用这种方法
         */
        List<PasswordEntity> entityList = passwordDao.queryAll();
        List<PasswordEntity> collect = entityList.stream()
                .filter(item -> Arrays.equals(shaCiphertext, item.getPswCiphertext()))
                .collect(Collectors.toList());
        if(collect != null && collect.size() > 0){
            //密码认证成功
            flag = true;
            // TODO 需要进行登录子表记录登录信息
        }
        return flag;
    }
}
