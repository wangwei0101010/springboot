package com.breakyizhan.web.common.config;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 程序启动中先执行  ......@PostConstruct............
 * 然后tomcat启动, Tomcat started on port(s): 8080 (http),Started WebApplication in 8.992 seconds (JVM running for 9.832)
 * 再然后执行  执行了CommandLineRunner方法,在程序启动后触发
 * */
@Component
public class CommandLineRunnerConfig implements CommandLineRunner {

   //实现了CommandLineRunner接口之后，在程序启动的时候就会触发run函数内的任务执行了
   @Override
   public void run(String... args) throws Exception {
      System.err.println("执行了CommandLineRunner方法");
   }


   @PostConstruct
   public void init2() {
      System.out.println("......@PostConstruct............");
   }





}
