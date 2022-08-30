package com.breakyizhan.web.kuangshen.lock8;

import java.util.concurrent.TimeUnit;
/**
 * 7. 1个静态同步方法,1个普通同步方法,1个对象  (延时前==>延时1s==>打电话==>延时4s==>发短信)
 * 8. 1个静态同步方法,1个普通同步方法,2个对象  (延时前==>延时1s==>打电话==>延时4s==>发短信),因为是2个不同的锁,互不影响,一个锁Class 一个锁当前调用者
 * */
public class Test4 {

  public static void main(String[] args) {
    //2个对象,两个调用者,两把锁
    //Phone4 phone = new Phone4();
    Phone4 phone1 = new Phone4();
    Phone4 phone2 = new Phone4();
    //锁的存在
    new Thread(() -> {
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
    new Thread(() -> {
      phone2.call();
    }, "B").start();

  }

}

//Phone3唯一的一个class对象,
class Phone4 {

  //静态同步方法 锁的是Class类模板
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

  //普通同步方法 锁的是调用者
  public   synchronized void call() {
    System.out.println("打电话");
  }


}