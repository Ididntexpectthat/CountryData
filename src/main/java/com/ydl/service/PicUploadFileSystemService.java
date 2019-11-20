package com.ydl.service;

import com.ydl.entity.FileUploadResult;
import org.springframework.web.multipart.MultipartFile;



public interface PicUploadFileSystemService {

    FileUploadResult upload(MultipartFile uploadFile, String username);

    String getFilePath(String sourceFileName,String suername);
}
