package com.breakyizhan.web.kuangshen.add;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//加法计数器
public class CyclicBarrierDemo {

  public static void main(String[] args) {
    //7颗龙珠召唤神龙
    //召唤龙珠的线程
    CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
      System.out.println("召唤神龙成功");
    });
    for (int i = 1; i <= 7; i++) {
      final  int temp = i;
      //lambda能操作到i吗 需要final
      new Thread(()->{
        System.out.println(Thread.currentThread().getName()+"收集了i:"+temp+"个龙珠");
        try {
          cyclicBarrier.await();//等待
        } catch (InterruptedException e) {
          e.printStackTrace();
        } catch (BrokenBarrierException e) {
          e.printStackTrace();
        }
      }).start();
    }

  }
}
