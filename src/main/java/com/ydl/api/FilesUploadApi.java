package com.ydl.api;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.ydl.entity.FileUploadResult;
import com.ydl.service.FileUploadService;
import com.ydl.utils.FileSaveUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 多文件上传控制类
 *
 * @author Administrator
 */
@Controller
@RequestMapping("Files")
public class FilesUploadApi {

    // 读取application.properties文件中的自定义配置项
    @Value("${spring.fileupload.destination}")
    private String destination;
    @Autowired
    FileUploadService fileUploadService;

//    @RequestMapping("/files")
//    public String index() {
//        return "uploads";
//    }

    /**
     * 多文件上传类
     * 文件会自动绑定到MultipartFile中
     *
     * @param request 获取请求信息
     *                //	 * @param description 文件描述
     * @param files   上传的文件
     * @return 上传成功或失败结果
     * @throws IOException
     * @throws IllegalStateException
     */
    @PostMapping("/upload")
    public Object filesUpload(HttpServletRequest request,
                              @RequestParam("files") MultipartFile[] files,@RequestParam("name")String name) throws IllegalStateException, IOException {

        // 获取文件描述参数 description，纯粹测试使用
//		if (null != descriptions && descriptions.length > 0) {
//			for (int i=0; i < descriptions.length; i++) {
//				String description = descriptions[i];
//				System.out.println("description" + i + " = " + description);
//			}
//		}
        System.out.println(destination);
        // 构建上传文件的存放路径
        String destionation = destination + File.separator + "files";
        System.out.println("destionation = " + destionation);
        System.out.println(null != files && files.length > 0);
        JSONObject jsonObject = new JSONObject();
        int i = 0;//取文件下标
        // 如果文件不为空，写入上传路径，进行文件上传
        if (null != files && files.length > 0) {
            System.out.println("???");
            for (MultipartFile file : files) {
                // 测试MultipartFile接口的各个方法
                System.out.println("文件类型ContentType=" + file.getContentType());
                System.out.println("文件组件名称Name=" + file.getName());
                System.out.println("文件原名称OriginalFileName=" + file.getOriginalFilename());
                System.out.println("文件大小Size=" + file.getSize() + "byte or " + file.getSize() / 1024 + "KB");
                FileUploadResult fileUploadResult = fileUploadService.fileUpload(file,destination,name);
//                FileUploadResult fileUploadResult = FileSaveUtil.saveFile(file, destionation, "鬼子村");
                i++;
                if(fileUploadResult.getStatus().equals("done") && file!=files[files.length-1]){
                    jsonObject.put("pic_url"+"_"+i, fileUploadResult.getName());
                }
                if (fileUploadResult.getStatus().equals("error") && file==files[files.length-1]) {
                    jsonObject.put("message", fileUploadResult.getName()+"上传失败");
                    return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
                }
                if (fileUploadResult.getStatus().equals("done") && file==files[files.length-1]) {
                    if (fileUploadResult.getName() != null) {
                        System.out.println(fileUploadResult.getName());
                        jsonObject.put("message", "上传成功");
                        jsonObject.put("pic_url"+"_"+i, fileUploadResult.getName());
                        return new ResponseEntity(jsonObject, HttpStatus.OK);
                    }
                }

            }

        }
		jsonObject.put("message", "未知漏洞，请联系作者");
		return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
    }


}
