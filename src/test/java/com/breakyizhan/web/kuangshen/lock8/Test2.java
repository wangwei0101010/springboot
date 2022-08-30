package com.breakyizhan.web.kuangshen.lock8;

import java.util.concurrent.TimeUnit;
/**
 * 3. 增加了一个普通方法hello, 是先执行打印发短信还是hello(延时前==>延时1s==>hello==>延时4s==>发短信)
 * 4. 新建一个Phone2对象,两个对象,两个同步方法 (延时前==>延时1s==>打电话==>延时4s==>发短信)
 * */
public class Test2 {


  public static void main(String[] args) {
    //2个对象,两个调用者,两把锁
    Phone2 phone1 = new Phone2();
    Phone2 phone2 = new Phone2();
    //锁的存在
    new Thread(phone1::sendSms, "A").start();
    //捕获异常
    try {
      TimeUnit.SECONDS.sleep(1);
      System.out.println("延时1s");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //new Thread(phone::hello, "B").start();//测试3
    new Thread(phone2::call, "B").start();

  }

}


class Phone2 {
  //synchronized 锁的对象是方法的调用者
  //两个方法用的同一个锁,随先拿到谁执行!
  public synchronized void sendSms() {
    try {
      System.out.println("延时前");
      TimeUnit.SECONDS.sleep(4);
      System.out.println("延时4s");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("发短信");
  }

  public synchronized void call() {
    System.out.println("打电话");
  }

  //这里没有锁!!!不是同步方法,不受锁的影响
  public  void hello() {
    System.out.println("hello");
  }


}
