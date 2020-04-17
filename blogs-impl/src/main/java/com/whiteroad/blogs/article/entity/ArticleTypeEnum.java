package com.whiteroad.blogs.article.entity;

/**
 * @author Da
 * @date 2020/4/14 14:29
 * 文章类型
 */
public class ArticleTypeEnum {
    /**
     * 标准Standard类型
     * StandardWaterfallElement标签
     */
    public static final int STANDARD = 1;

    /**
     * 引用quote类型
     * QuoteWaterfallElement标签
     */
    public static final int QUOTE = 2;

    /**
     * 音频audio类型
     * AudioWaterfallElement标签
     */
    public static final int AUDIO = 3;

    /**
     * 视频video类型
     * VideoWaterfallElement便签
     */
    public static final int VIDEO = 4;

    /**
     * 连接link类型
     * LinkWaterfallElement标签
     */
    public static final int LINK = 5;

    /**
     * 画廊gallery类型
     * GalleryWaterfallElement标签
     */
    public static final int GALLERY = 6;

}
