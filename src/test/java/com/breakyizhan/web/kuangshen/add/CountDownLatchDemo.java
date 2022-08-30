package com.breakyizhan.web.kuangshen.add;

import java.util.concurrent.CountDownLatch;

//计数器,减法计数器
public class CountDownLatchDemo {

  public static void main(String[] args) {

    //倒计时,总数是6
    CountDownLatch countDownLatch = new CountDownLatch(6);
    for (int i = 0; i < 6; i++) {
      new Thread(()->{
        System.out.println(Thread.currentThread().getName()+"go out");
        countDownLatch.countDown();//数量-1
      },String.valueOf(i)).start();
    }

    try {
      countDownLatch.await();//等待计数器归零,在往下执行
      System.out.println("close Door");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }
}
