package com.whiteroad.blogs.password.service.impl;

import com.whiteroad.blogs.password.entity.PasswordEntity;
import com.whiteroad.blogs.password.service.PasswordService;
import com.whiteroad.blogs.password.vo.PasswordVo;
import com.whiteroad.utils.WhiteroadShaMessageDigest;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/11 16:25
 * 管理员密码Service实现类
 */
@Service
@Transactional
public class PasswordServiceImpl implements PasswordService {

//    @Autowired
//    private PasswordDao dao;

    @Override
    public List<PasswordVo> insertInit() {
        List<PasswordVo> backVos = new ArrayList<>();

        List<PasswordEntity> pwsEntityList = new ArrayList<>();
        PasswordEntity pwsEntity = new PasswordEntity();
        pwsEntity.setPswUserName("Mr.Da");
        byte[] shaCiphertext = WhiteroadShaMessageDigest.getShaCiphertext("ZhangDa112587");
        pwsEntity.setPswCiphertext(shaCiphertext);
        pwsEntityList.add(pwsEntity);
//        Iterable<PasswordEntity> passwordEntities = dao.saveAll(pwsEntityList);
//        for (PasswordEntity entity : passwordEntities){
//            PasswordVo vo = new PasswordVo();
//            PasswordDataUtils.copyEntityToVO(entity,vo);
//            backVos.add(vo);
//        }
        return backVos;
    }
}
