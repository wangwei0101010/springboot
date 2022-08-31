package com.breakyizhan.web.kuangshen.tvolatile;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 2.volatile不保证原子性
 */
public class VolatileDemo02 {

  //volatile 不保证原子性
  //原子类的integer
  private volatile static AtomicInteger number = new AtomicInteger();
  public  static void add() {
    //number++;//不是原子性操作
    number.getAndIncrement();//加1,底层CAS,效率高
  }

  public static void main(String[] args) {
    //理论结果2W
    for (int i = 0; i < 20; i++) {
      new Thread(() -> {
        for (int j = 0; j < 1000; j++) {
          add();
        }
      }).start();
    }
    while (Thread.activeCount() > 2) {//默认2个线程执行 1.main 2.GC
      Thread.yield();//线程礼让,保证上边线程执行完成,最后执行main方法
    }
    System.out.println(Thread.currentThread().getName() + " " + number);
  }

}
