package com.whiteroad.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Da
 * @date 2020/4/11 15:51
 * 数据加密
 * 使用MessageDigest类SHA算法
 */
public class WhiteroadShaMessageDigest {

    private final static Logger LOG = LoggerFactory.getLogger(WhiteroadShaMessageDigest.class);

    public static byte[] getShaCiphertext(String cleartext){
        byte[] ciphertext = new byte[0];
        try {
            byte[] cleartextBytes = cleartext.getBytes("UTF8");
            MessageDigest sha = MessageDigest.getInstance("SHA");
            ciphertext = sha.digest(cleartextBytes);
        } catch (UnsupportedEncodingException e) {
            LOG.error("----WhiteroadShaMessageDigest->getShaCiphertext->UnsupportedEncodingException->" + e.getMessage());
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            LOG.error("----WhiteroadShaMessageDigest->getShaCiphertext->NoSuchAlgorithmException->" + e.getMessage());
            e.printStackTrace();
        }

        return ciphertext;
    }


    public static void main(String[] args) {
//        String shaCiphertext = w.getShaCiphertext("zxc123456asd@8555!@#");
        byte[] shaCiphertext = WhiteroadShaMessageDigest.getShaCiphertext("123456789asdadsa@434d5d1");
        System.out.println(shaCiphertext);
    }
}
