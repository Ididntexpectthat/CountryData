package com.ydl.api.userManagementPlatform;

import com.alibaba.fastjson.JSONObject;
import com.ydl.entity.FileUploadResult;
import com.ydl.service.FileUploadService;
import com.ydl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("Pic")
public class PicUploadApi {
    // 读取application.properties文件中的自定义配置项
    @Value("${spring.fileupload.destination}")
    private String destination;

    @Autowired
    private FileUploadService fileUploadService;
    //    @Autowired
//    UserDao userDao;
    @Autowired
    UserService userService;

    @PostMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile uploadFile, @RequestParam("username") String username) throws Exception {
        JSONObject jsonObject = new JSONObject();
        FileUploadResult fileUploadResult = fileUploadService.picUpload(uploadFile,destination, username);
        if (fileUploadResult.getStatus().equals("noexpected")) {
            jsonObject.put("message", "请上传符合格式的图片");
            return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
        }
        if (fileUploadResult.getStatus().equals("error")) {
            jsonObject.put("message", "上传失败");
            return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
        }
        if (userService.findByUsername(username) == null) {
            jsonObject.put("message", "用户不存在！");
            return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
        }
        if (fileUploadResult.getStatus().equals("done")) {
            if (fileUploadResult.getName() != null) {
                System.out.println(fileUploadResult.getName());
                userService.updatePicUrl(fileUploadResult.getName(), username);
                jsonObject.put("message", "上传成功");
                jsonObject.put("pic_url", fileUploadResult.getName());
                return new ResponseEntity(jsonObject, HttpStatus.OK);
            }
        }
        jsonObject.put("message", "未知漏洞，请联系作者");
        return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
    }
}
