package com.whiteroad.blogs.password.controller;

import com.whiteroad.blogs.password.service.PasswordService;
import com.whiteroad.blogs.password.vo.PasswordVo;
import com.whiteroad.database.JsonBackData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Da
 * @date 2020/4/11 16:20
 * 管理员密码Controller类
 */
@Controller
@RequestMapping(value = "PasswordController")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    /**
     * 初始化管理员密码数据
     * @return JsonBackData
     */
    @RequestMapping(value = "insertInit")
    @ResponseBody
    public JsonBackData insertInit(){
        JsonBackData back = new JsonBackData();
        try {
            List<PasswordVo> backVO = passwordService.insertInit();
            back.setBackData(backVO);
            back.setBackMsg("初始化成功");
        } catch (Exception e) {
            back.setSuccess(false);
            back.setBackMsg("初始化失败:"+e.getMessage());
        }
        return back;
    }
}
