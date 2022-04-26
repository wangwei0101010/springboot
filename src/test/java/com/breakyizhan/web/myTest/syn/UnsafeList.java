package com.breakyizhan.web.myTest.syn;

import java.util.ArrayList;
import java.util.List;

//线程不安全的集合
public class UnsafeList {

  public static void main(String[] args) throws InterruptedException {
    List<String> list = new ArrayList<>();
    for(int i = 0;i<1000;i++){
      new Thread(() -> {
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        list.add(Thread.currentThread().getName());
      }).start();
    }
    System.err.println(list.size());
  }

}
