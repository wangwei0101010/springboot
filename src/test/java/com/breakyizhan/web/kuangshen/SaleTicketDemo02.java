package com.breakyizhan.web.kuangshen;

//基本的卖票例子

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 真正的多线程开发,公司中的开发,降低耦合性 线程就是一个单独的资源类,没有任何附属的操作,拿来即用 1.属性、方法
 */
public class SaleTicketDemo02 {

  public static void main(String[] args) {
    //并发,多线程操作同一个资源类,把资源类丢入线程
    Ticket2 ticket = new Ticket2();
    new Thread(() -> { for (int i = 1; i < 40; i++) { ticket.sale(); } }, "A").start();
    new Thread(() -> { for (int i = 1; i < 40; i++) { ticket.sale(); } }, "B").start();
    new Thread(() -> { for (int i = 1; i < 40; i++) { ticket.sale(); } }, "C").start();

  }


}

//lock三部曲
//1.new ReentrantLock
//2.lock.lock();
//3.lock.unlock();
class Ticket2 {

  //属性、方法
  private int number = 30;

  Lock lock = new ReentrantLock();

  //卖票的方式

  public void sale() {
    lock.lock();//加锁
    try {
      //业务代码
      if (number > 0) {
        System.err
            .println(Thread.currentThread().getName() + "卖出了" + (number--) + "张票,剩余:" + number);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();//解锁
    }


  }
}
