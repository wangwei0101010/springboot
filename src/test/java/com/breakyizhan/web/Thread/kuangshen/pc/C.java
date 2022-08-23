package com.breakyizhan.web.Thread.kuangshen.pc;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Condition精确通知
public class C {

  //A执行完调用 B执行完调用 C执行完调用A, 顺序执行
  public static void main(String[] args) {
    Data3 date = new Data3();

    new Thread(() -> {
      for (int i = 0; i <10 ; i++) {
        date.printA();
      }
    }, "A").start();
    new Thread(() -> {
      for (int i = 0; i <10 ; i++) {
        date.printB();
      }
    }, "B").start();
    new Thread(() -> {
      for (int i = 0; i <10 ; i++) {
        date.printC();
      }
    }, "C").start();
  }



}

class Data3 {

  //资源类 lock
  private Lock lock = new ReentrantLock();
  private Condition condition1 = lock.newCondition();
  private Condition condition2 = lock.newCondition();
  private Condition condition3 = lock.newCondition();
  private int number = 1; //1A 2B 3C

  public void printA() {

    lock.lock();
    try {
      //业务 判断 执行 和通知
      while (number != 1) {
        //等待
        condition1.await();
      }
      System.err.println(Thread.currentThread().getName() + "AAAAAAAAa");
      //唤醒指定的人B:
      number = 2;
      condition2.signal();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }

  }

  public void printB() {

    lock.lock();
    try {
      //业务 判断 执行 和通知
      while (number != 2) {
        condition2.await();
      }
      System.err.println(Thread.currentThread().getName() + "BBBBBBBBB");
      number = 3;
      //唤醒指定的人C:
      condition3.signal();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public void printC() {

    lock.lock();
    try {
      //业务 判断 执行 和通知
      while (number != 3) {
        condition3.await();
      }
      System.err.println(Thread.currentThread().getName() + "CCCCCCC");
      number = 1;
      condition1.signal();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

}
