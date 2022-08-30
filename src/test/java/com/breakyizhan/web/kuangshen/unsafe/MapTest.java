package com.breakyizhan.web.kuangshen.unsafe;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

  public static void main(String[] args) {
    //map是这样用的吗? 不是,工作中不用hashMap
    // 默认等价于什么? new HashMap<>(16,0.75)
    //加载因子和初始化容量
    Map<String, String> map = new ConcurrentHashMap<>();
    //java.util.ConcurrentModificationException并发修改异常
    /**
     * 解决
     *  new ConcurrentHashMap<>();
     *
     * */
    for (int i = 0; i < 30; i++) {
      new Thread(()->{
        map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
        System.out.println(map);
      },String.valueOf(i)).start();
    }


  }

}
