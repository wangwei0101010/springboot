package com.breakyizhan.web.Thread.kuangshen.bq;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * 同步队列
 * 和其他的BlockingQueue不一样,他是不存元素的
 * put一个元素,必须要先take取出来,否则不能put对象
 * */
public class SynchronousQueueDemo {

  public static void main(String[] args) {
    BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
    new Thread(()->{
      try {
        System.out.println(Thread.currentThread().getName()+"put 1");
        blockingQueue.put("1");
        System.out.println(Thread.currentThread().getName()+"put 2");
        blockingQueue.put("2");
        System.out.println(Thread.currentThread().getName()+"put 3");
        blockingQueue.put("3");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    },"T1").start();


    new Thread(()->{
      try {
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName()+"   "+blockingQueue.take());
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName()+"    "+blockingQueue.take());
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName()+"     "+blockingQueue.take());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    },"T2").start();

  }

}
