package cn.ty.wechart.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.ty.wechart.util.CheckUtil;

public class WeChartController {
	/**
     * 验证微信服务器
     * 
     * @param response
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
       System.out.println("hello world");
       return "hello world";
    }
	/**
     * 验证微信服务器
     * 
     * @param response
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     */
    @RequestMapping(value = "/wechat", method = RequestMethod.GET)
    public void wechatService(PrintWriter out, HttpServletResponse response,
            @RequestParam(value = "signature", required = false) String signature, @RequestParam String timestamp,
            @RequestParam String nonce, @RequestParam String echostr) {
        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
    }
    
    
}
