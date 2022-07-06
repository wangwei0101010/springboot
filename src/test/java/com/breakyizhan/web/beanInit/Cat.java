package com.breakyizhan.web.beanInit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试bean的生命周期,和加载顺序
 * */
public class Cat implements InitializingBean, DisposableBean {

  private String name;

  /***
   * 构造方法-----创建对象时调用
   */
  public Cat(){
    System.out.println("Cat......constructor............");
  }


  /***
   * 设置name属性时会调用
   * @param name
   */
  public void setName(String name) {
    System.out.println("===cat=========setName========");
    this.name = name;
  }

  public String getName() {
    return name;
  }


  /***
   * 在配置类中利用注解将initMethod指向下面的init方法----对应于initMethod的用法
   */
  public void init() {
    System.out.println("Cat......init............");
  }


  /***
   * 在配置类中利用注解将destroyMethod指向下面的destroy方法----对应于destroyMethod的用法
   */
  public void destroyMethod() {
    System.err.println("cat....destroyMethod.....");
  }


  /***
   * 继承了InitializingBean接口，需要实现afterPropertiesSet方法---对应于InitializingBean的用法
   */
  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Cat......afterPropertiesSet............");
  }

  /***
   * 继承了DisposableBean接口，需要实现destroy方法---对应于DisposableBean的用法
   */
  @Override
  public void destroy() throws Exception {
    System.err.println("Cat......DisposableBean............");
  }


  @PostConstruct
  public void init2() {
    System.out.println("Cat......@PostConstruct............");
  }

  @PreDestroy
  public void destroy2() {
    System.err.println("Cat......@PreDestroy............");
  }



  public static void main(String[] args) {
    /**
     *
     * 执行顺序
     * Cat......constructor............
     * ===cat=========setName========
     * Cat......@PostConstruct............
     * Cat......afterPropertiesSet............
     * Cat......init............
     * 2022-07-06 08:50:28.036  INFO   --- [           main] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@6737fd8f: startup date [Wed Jul 06 08:50:27 CST 2022]; root of context hierarchy
     * Cat......@PreDestroy............
     * Cat......DisposableBean............
     * cat....destroyMethod.....
     *
     *
     * */
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        AppConfig.class);
    ctx.getBean(Cat.class);
    ctx.close();


  }
}


