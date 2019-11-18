package com.ydl.interceptor;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jinbin
 * @date 2018-07-08 22:37
 */
//@CrossOrigin
@ControllerAdvice
public class GloablExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleException(HttpServletRequest req, HttpServletResponse res,Exception e) {
        System.out.println(e);
        res.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,"*");
        String msg = e.getMessage();
        if (msg == null || msg.equals("")) {
            msg = "服务器出错";
        }
        System.out.println("******************异常处理******************");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", msg);
        return jsonObject;
//        return new ResponseEntity(msg, HttpStatus.UNAUTHORIZED);
    }
}
