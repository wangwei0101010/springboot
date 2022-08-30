package com.breakyizhan.web.kuangshen.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B {


  public static void main(String[] args) {

    Data02 date = new Data02();

    new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        try {
          date.increment();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    }, "A").start();
    new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        try {
          date.decrement();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    }, "B").start();

    new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        try {
          date.increment();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    }, "C").start();

    new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        try {
          date.decrement();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    }, "D").start();
  }

}

class Data02 {//数字 资源类

  private int number = 0;
  Lock lock = new ReentrantLock();
  Condition condition = lock.newCondition();
  //condition.await(); 等待
  // condition.signalAll();唤醒全部

  //+1
  public void increment() throws InterruptedException {
    lock.lock();
    try {
      while (number != 0) {
        //等待
        condition.await();
      }
      number++;
      System.out.println(Thread.currentThread().getName() + "==>" + number);
      //通知其他线程,我+1完毕了
      condition.signalAll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }

  }

  public void decrement() throws InterruptedException {
    lock.lock();
    try {
      while (number == 0) {
        //等待
        condition.await();
      }
      number--;
      System.out.println(Thread.currentThread().getName() + "==>" + number);
      //通知其他线程,我-1完毕了
      condition.signalAll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }

  }

}
