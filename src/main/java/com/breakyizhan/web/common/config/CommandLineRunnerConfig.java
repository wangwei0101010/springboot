package com.breakyizhan.web.common.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CommandLineRunnerConfig implements CommandLineRunner {

   //实现了CommandLineRunner接口之后，在程序启动的时候就会触发run函数内的任务执行了
   @Override
   public void run(String... args) throws Exception {
      System.err.println("执行了CommandLineRunner方法");
   }

}
