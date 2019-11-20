package com.ydl.service;

import com.ydl.entity.FileUploadResult;
import org.springframework.web.multipart.MultipartFile;



public interface FileUploadService {

    FileUploadResult picUpload(MultipartFile uploadFile,String destination, String username);

    FileUploadResult fileUpload(MultipartFile uploadFile,String destination, String username);


}
