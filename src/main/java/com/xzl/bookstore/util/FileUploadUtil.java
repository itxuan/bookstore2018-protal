package com.xzl.bookstore.util;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.xzl.bookstore.config.OSSConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FileUploadUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileUploadUtil.class);

    public static void uploadImageByOSS(String imageName, InputStream inputStream) {
        OSSClient client = new OSSClient(OSSConfig.ENDPOINT, OSSConfig.ACCESS_KEY_ID, OSSConfig.ACCESS_KEY_SECRET);
        try {

            client.putObject(OSSConfig.BACKET_NAME, imageName, inputStream);
        } catch (OSSException | ClientException e) {

            logger.error("OSSException,ClientException",e.getMessage());
        } finally {

            client.shutdown();
        }
    }

    /**
     * 创建新的文件名称-->imageName
     *
     * @param fileName
     * @return
     */
    public static String generateFileName(String fileName) {
        DateFormat format = new SimpleDateFormat("yyMMddHHmmss");
        String formatDate = format.format(new Date());
        int random = new Random().nextInt(10000);
        int position = fileName.lastIndexOf(".");
        String extension = fileName.substring(position);
        return formatDate + random + extension;
    }



    /**
     * 创建新的文件名称(进一步封装)
     * 传入MutiparFile
     *
     * @param multipartFile
     * @return
     */
    public static String generateFileName(MultipartFile multipartFile) {
        String newName = multipartFile.getOriginalFilename();
        DateFormat format = new SimpleDateFormat("yyMMddHHmmss");
        String formatDate = format.format(new Date());
        int random = new Random().nextInt(10000);
        int position = newName.lastIndexOf(".");
        String extension = newName.substring(position);
        return formatDate + random + extension;
    }
}
