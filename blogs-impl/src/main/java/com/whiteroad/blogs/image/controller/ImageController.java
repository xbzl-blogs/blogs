package com.whiteroad.blogs.image.controller;

import com.whiteroad.blogs.image.service.ImageQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Da
 * @date 2020/4/15 11:38
 */
@Controller
@RequestMapping(value = "ImageController")
public class ImageController {

    @Autowired
    private ImageQueryService imageQueryService;


    @RequestMapping("getImage")
    @ResponseBody
    public void getImageForImageId(HttpServletRequest request, HttpServletResponse response){
        try{
            String imageId = request.getParameter("imageId");
            imageQueryService.findImageById(response,imageId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
