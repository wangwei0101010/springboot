package com.breakyizhan.web.kuangshen.lock8;

import java.util.concurrent.TimeUnit;
/**
 *
 * 5.增加2个静态的同步方法  (延时前==>延时1s==>延时4s==>发短信==>打电话),static锁的是class对象!!!
 * 6.2个对象增加两个静态静态的同步方法,先打印???  (延时前==>延时1s==>延时4s==>发短信==>打电话),static锁的是class对象!!!
 * */
public class Test3 {
    public static void main(String[] args) {
      //2个对象,两个调用者,两把锁
      //Phone3 phone = new Phone3();
      Phone3 phone1 = new Phone3();
      Phone3 phone2 = new Phone3();
      //锁的存在
      new Thread(()->{
        phone1.sendSms();
      }, "A").start();
      //捕获异常
      try {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("延时1s");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      //new Thread(phone::hello, "B").start();//测试3
      new Thread(()->{
        phone2.call();
      }, "B").start();

    }

}

//Phone3唯一的一个class对象,
class Phone3 {
  //synchronized 锁的对象是方法的调用者
  //static 静态方法
  // 类已加载就有了! 锁的是class对象,Class模板
  public static synchronized void sendSms() {
    try {
      System.out.println("延时前");
      TimeUnit.SECONDS.sleep(4);
      System.out.println("延时4s");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("发短信");
  }

  public static synchronized void call() {
    System.out.println("打电话");
  }



}