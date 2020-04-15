package com.whiteroad.blogs.image.service;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Da
 * @date 2020/4/15 11:42
 * 图片库查询接口
 */
public interface ImageQueryService {


    /**
     * 通过id获取图片
     * @param response
     * @param imageId 图片id
     */
    void findImageById(HttpServletResponse response, String imageId) throws Exception;
}
