package com.breakyizhan.web.kuangshen.tvolatile;

import java.util.concurrent.TimeUnit;
/**
 * 1.volatile可见性
 * */
public class VolatileDemo {

  //不加volatile线程死循环,加了就可见性
  private static  volatile int number = 0;

  public static void main(String[] args) throws InterruptedException {

    new Thread(()->{
      while (number == 0){

      }
    }).start();
    TimeUnit.SECONDS.sleep(1);
    number = 1;
    System.out.println(number);
  }

}
