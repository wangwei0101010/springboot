package com.breakyizhan.web.kuangshen.unsafe;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;


public class SetTest {

  public static void main(String[] args) {
//java.util.ConcurrentModificationException 并发修改异常
    /**
     * 解决方案:
     * 1. Collections.synchronizedSet(new HashSet<>());
     * 2. new CopyOnWriteArraySet<>();
     *
     * */
    Set<String> set = new CopyOnWriteArraySet<>();
    for (int i = 1; i <10 ; i++) {
      new Thread(()->{
        set.add(UUID.randomUUID().toString().substring(0,5));
        System.out.println(set);
      },String.valueOf(i)).start();

    }

  }

}
