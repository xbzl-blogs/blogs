package com.whiteroad.blogs.article.controller;

import com.whiteroad.blogs.article.service.ArticleQueryService;
import com.whiteroad.blogs.article.vo.ArticleVo;
import com.whiteroad.database.JsonBackData;
import com.whiteroad.database.query.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Da
 * @date 2020/4/14 15:02
 * 文章Controller类
 */
@Controller
@RequestMapping(value = "articleController")
public class ArticleController {

    @Autowired
    private ArticleQueryService articleService;


    @RequestMapping(value = "queryList")
    @ResponseBody
    public JsonBackData queryList(@RequestBody(required = false) QuerySchema querySchema){
        JsonBackData back = new JsonBackData();
        try {
            List<ArticleVo> backVO = articleService.queryList(querySchema);
            back.setBackData(backVO);
            back.setBackMsg("查询成功");
        } catch (Exception e) {
            back.setSuccess(false);
            back.setBackMsg("查询失败:"+e.getMessage());
            e.printStackTrace();
        }
        return back;
    }

}
