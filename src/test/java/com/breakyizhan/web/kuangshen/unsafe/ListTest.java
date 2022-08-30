package com.breakyizhan.web.kuangshen.unsafe;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

//ConcurrentModificationException 并发修改异常
public class ListTest {

  public static void main(String[] args) {
    //并发下 ArrayList 不安全的
    /**
     * 解决方案:
     * 1. List<String> list = new Vector<>();
     * 2. Collections.synchronizedList(new ArrayList<>());
     * 3. new CopyOnWriteArrayList<>();
     *
     * */
    //CopyOnWriteArrayList 写入时复制 ,COW 计算机程序设计领域的一种优化策略
    //多个线程调用的时候, list 读取的时候,是固定的,写入(覆盖)的时候,避免覆盖,造成数据问题
    //CopyOnWriteArrayList比Vector区别 一个是sync(性能低)一个是lock锁
    List<String> list =  new CopyOnWriteArrayList<>();
    for (int i = 1; i <=10; i++) {
      new Thread(()->{
        list.add(UUID.randomUUID().toString().substring(0,5));
        System.out.println(list);
      },String.valueOf(i)).start();




    }
  }

}
