package com.breakyizhan.web.Thread.kuangshen.bq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
/**
 * 阻塞队列4种方式
 * */
public class Test {

  public static void main(String[] args) throws InterruptedException {

    //test1();
    //test2();
    //test3();
    test4();
  }
  /**
   * 抛出异常
   * */
  public static void test1(){
    //队列的大小
    ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
    System.out.println(blockingQueue.add("a"));
    System.out.println(blockingQueue.add("b"));
    System.out.println(blockingQueue.add("c"));
    //java.lang.IllegalStateException: Queue full,添加第4个报错
    //System.out.println(blockingQueue.add("d"));
    System.out.println(blockingQueue.element());//查看队首的元素是谁 (a)
    System.out.println("===============");
    //先进先出
    System.out.println(blockingQueue.remove());
    System.out.println(blockingQueue.remove());
    System.out.println(blockingQueue.remove());
    //多移除一个报错 java.util.NoSuchElementException
    //System.out.println(blockingQueue.remove());
  }

  /**
   * 不抛出异常,有返回值
   * */
  public static void test2(){
    //队列的大小
    ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
    System.out.println(blockingQueue.offer("a"));//返回true
    System.out.println(blockingQueue.offer("b"));//返回true
    System.out.println(blockingQueue.offer("c"));//返回true
    //添加第4个不抛出异常,返回false
    //System.out.println(blockingQueue.offer("d"));
    System.out.println(blockingQueue.peek());//查看队首的元素是谁 (a)
    System.out.println("===============");
    ////先进先出
    System.out.println(blockingQueue.poll());//返回a
    System.out.println(blockingQueue.poll());//b
    System.out.println(blockingQueue.poll());//c
    //多移除一个返回 null
    //System.out.println(blockingQueue.poll());
  }

  /**
   * 队列满了,新来的进行等待和阻塞(一直阻塞)
   * */
  public static void test3() throws InterruptedException {
    //队列的大小
    ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
    //一直阻塞
    blockingQueue.put("a");
    blockingQueue.put("b");
    blockingQueue.put("c");
    //blockingQueue.put("d");//队列没有位置了,需要一直等待
    System.out.println(blockingQueue.take());
    System.out.println(blockingQueue.take());
    System.out.println(blockingQueue.take());
    System.out.println(blockingQueue.take());//没有这个元素,需要一直等待,卡死
  }

  /**
   * 队列满了,新来的进行等待和阻塞(等待超时)
   * */
  public static void test4() throws InterruptedException {
    //队列的大小
    ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
    //一直阻塞
    blockingQueue.offer("a");
    blockingQueue.offer("b");
    blockingQueue.offer("c");
    blockingQueue.offer("d",2, TimeUnit.SECONDS);//等2s后超时退出
    System.out.println("=========");
    blockingQueue.poll();
    blockingQueue.poll();
    blockingQueue.poll();
    blockingQueue.poll(2, TimeUnit.SECONDS);//等2s后超时退出

  }


}
