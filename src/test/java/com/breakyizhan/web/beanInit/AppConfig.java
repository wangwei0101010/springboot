package com.breakyizhan.web.beanInit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan()
@Configuration
public class AppConfig {

  /***
   * 单实例非懒加载的bean
   * @return
   */
  //@Lazy 懒加载
  //@Scope("prototype") 多例
  @Bean(initMethod = "init", destroyMethod = "destroyMethod")
  public Cat buildCat() {
    Cat cat = new Cat();
    cat.setName("花花");
    System.out.println("buildCat");
    return cat;
  }

}
