package com.breakyizhan.web.Thread.kuangshen.readWriteLock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * 独占锁(写锁) 一次一个线程占有
 * 共享锁(读锁) 多个线程可以同时占有
 *
 *1. 读和读 共存
 *2. 读和写 不共存
 *3. 写和写 不共存
 *
 * hashmap线程不安全是建立在作为成员变量多并发操作且无同步处理的情况下，在方法中作为局部变量是没有并发问题的
 *
 */
public class ReadWriteLockDemo {

  public static void main(String[] args) {

    //MyCache myCache = new MyCache();
    MyCacheLock myCache = new MyCacheLock();
    //写入
    for (int i = 1; i <= 5; i++) {
      final int  temp = i;
      new Thread(()->{
        myCache.put(temp+"",temp+"");
      },String.valueOf(i)).start();
    }
    //读取
    for (int i = 1; i <= 5; i++) {
      final int  temp = i;
      new Thread(()->{
        myCache.get(temp+"");
      },String.valueOf(i)).start();
    }
  }
}


/**
 * 自定义缓存:加锁
 */
class MyCacheLock {

  private volatile Map<String, Object> map = new HashMap<>();
  //读写锁 更加细粒度的控制
  private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

  //写入同时只有一个线程写
  public void put(String key, String object) {
    try {
      readWriteLock.writeLock().lock();
      System.out.println(Thread.currentThread().getName() + "写入key" + key);
      map.put(key, object);
      System.out.println(Thread.currentThread().getName() + "写入完毕" + key);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      readWriteLock.writeLock().unlock();
    }
  }

  //读可以所有人同时读
  public void get(String key) {
    try {
      readWriteLock.readLock().lock();
      System.out.println(Thread.currentThread().getName() + "读key" + key);
      map.get(key);
      System.out.println(Thread.currentThread().getName() + "读完毕key" + key);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      readWriteLock.readLock().unlock();
    }
  }
}

/**
 * 自定义缓存
 */
class MyCache {

  private volatile Map<String, Object> map = new HashMap<>();

  public void put(String key, String object) {
    System.out.println(Thread.currentThread().getName() + "写入key" + key);
    map.put(key, object);
    System.out.println(Thread.currentThread().getName() + "写入完毕" + key);
  }
  public void get(String key) {
    System.out.println(Thread.currentThread().getName() + "读key" + key);
    map.get(key);
    System.out.println(Thread.currentThread().getName() + "读完毕key" + key);
  }
}