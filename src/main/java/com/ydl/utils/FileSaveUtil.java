package com.ydl.utils;

import com.ydl.entity.FileUploadResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileSaveUtil {
    /**
     * 文件保存方法
     *
     * @param file
     * @param destination
     * @throws IOException
     * @throws IllegalStateException
     */
    public static FileUploadResult saveFile(MultipartFile file, String destination, String name,String fileName) {
            FileUploadResult fileUploadResult = new FileUploadResult();
            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
//             String filename = "icon.jpg";
//            String filename = file.getOriginalFilename();
            File file1 = new File(destination + File.separator + name);
            String filePath = file1.getPath()+File.separator+fileName;
            String FileUrl = StringUtils.replace(StringUtils.substringAfter(filePath,
                    "D:\\code\\upload"),
                    "\\", "/");
            fileUploadResult.setName("localhost:8888/upload" + FileUrl);
            System.out.println("filePath:"+filePath);
            // 判断路径是否存在，不存在则新创建一个
            if (!file1.isDirectory()) {
                System.out.println("创建没有");
                file1.mkdirs();
            }
            File newFile = new File(filePath);
//            System.out.println("***********" + filepath + File.separator + filename);
            // 将上传文件保存到目标文件目录
            try {
                file.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
                fileUploadResult.setStatus("error");
                return fileUploadResult;
            }


        fileUploadResult.setStatus("done");
        fileUploadResult.setUid(String.valueOf(System.currentTimeMillis()));
        return fileUploadResult;
    }



//    /**
//     * 文件保存方法
//     *
//     * @param files
//     * @param destination
//     * @throws IOException
//     * @throws IllegalStateException
//     */
//    public static FileUploadResult saveFile(MultipartFile[] files, String destination, String name) {
//        FileUploadResult fileUploadResult = new FileUploadResult();
//        for (MultipartFile file : files) {
//            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
//            String filename = file.getOriginalFilename();
//            File file1 = new File(destination + File.separator + name);
//            String filePath = file1.getPath()+File.separator+filename;
//            String FileUrl = StringUtils.replace(StringUtils.substringAfter(filePath,
//                    "F:\\code\\test-upload"),
//                    "\\", "/");
//            System.out.println("filePath:"+filePath);
//            // 判断路径是否存在，不存在则新创建一个
//            if (!file1.isDirectory()) {
//                System.out.println("创建没有");
//                file1.mkdirs();
//            }
//            File newFile = new File(filePath);
////            System.out.println("***********" + filepath + File.separator + filename);
//            // 将上传文件保存到目标文件目录
//            try {
//                file.transferTo(newFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//                fileUploadResult.setStatus("error");
//                return fileUploadResult;
//            }
//
//        }
//        fileUploadResult.setStatus("done");
//        fileUploadResult.setUid(String.valueOf(System.currentTimeMillis()));
//        return fileUploadResult;
//    }


}
