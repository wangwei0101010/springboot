package com.breakyizhan.web;

import com.breakyizhan.web.common.dataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableTransactionManagement
@Import({DynamicDataSourceRegister.class})
@MapperScan("com.breakyizhan.web.dao")
@EnableScheduling
public class WebApplication {



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
