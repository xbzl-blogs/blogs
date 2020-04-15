package com.whiteroad.blogs.image.service.impl;

import com.whiteroad.blogs.image.entity.ImageEntity;
import com.whiteroad.blogs.image.repository.ImageDao;
import com.whiteroad.blogs.image.service.ImageQueryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * @author Da
 * @date 2020/4/15 11:42
 * 图片库查询业务实现类
 */
@Service
public class ImageQueryServiceImpl implements ImageQueryService {

    @Autowired
    private ImageDao imageDao;

    @Override
    public void findImageById(HttpServletResponse response, String imageId) throws Exception {
        ImageEntity oneById = imageDao.findOneById(imageId);
        if(oneById != null){
            //图片物理路径
            String path = oneById.getPath();
            //图片记录信息
            String message = oneById.getMessage();
            //图片名称
            String name = oneById.getName();
            //图片类型
            String type = oneById.getType();

            if(StringUtils.isEmpty(path) || StringUtils.isEmpty(name)){
                throw new Exception("查询失败，路径错误 path + name :" + path + "---" + name);
            }

            FileInputStream fileIs=null;
            OutputStream outStream = null;
            try {
                fileIs = new FileInputStream(path+"/"+name);
                //得到文件大小
                int i=fileIs.available();
                //准备一个字节数组存放二进制图片
                byte data[]=new byte[i];
                //读字节数组的数据
                fileIs.read(data);
                //设置返回的文件类型
                response.setContentType("image/*");
                //得到向客户端输出二进制数据的对象
                outStream=response.getOutputStream();
                //输出数据
                outStream.write(data);
                outStream.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                //关闭输出流
                outStream.close();
                //关闭输入流
                fileIs.close();
            }
        }
    }
}
