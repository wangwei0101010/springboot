package com.breakyizhan.web.Thread.kuangshen.lock8;

import java.util.concurrent.TimeUnit;

/**
 * 8锁:关于8个锁的问题
 * 1.标准情况下,两个线程先后打印顺序?是发短信还是打电话? /结果: 先发短信,后打电话
 * 2.sendSms延迟1秒,两个线程先打印 发短信还是打电话 /结果: 先发短信,后打电话
 */
public class Test1 {

  public static void main(String[] args) {
    Phone phone = new Phone();
    //锁的存在
    new Thread(phone::sendSms, "A").start();
    //捕获异常
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    new Thread(phone::call, "B").start();

  }

}


class Phone {
  //synchronized 锁的对象是方法的调用者
  //两个方法用的同一个锁,随先拿到谁执行!
  public synchronized void sendSms() {
    try {
      TimeUnit.SECONDS.sleep(4);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("发短信");
  }

  public synchronized void call() {
    System.out.println("打电话");
  }

}
