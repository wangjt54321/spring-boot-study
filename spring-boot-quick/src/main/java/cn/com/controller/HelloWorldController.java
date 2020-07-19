package cn.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldController
 * @Description 第一个SpringBoot项目Hello World！
 * @Author Administrator
 * @Date 2020/7/19
 * @Version V1.0
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
