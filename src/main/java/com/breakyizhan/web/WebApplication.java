package com.breakyizhan.web;

import com.breakyizhan.web.Controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {

    @RequestMapping("/")
    String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

/*
    public static void main(String[] args) {

        // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloController.class);

        // 如果加载spring-context.xml文件：
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring-context.xml");
    }
*/

}
