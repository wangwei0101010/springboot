package com.breakyizhan.web.kuangshen.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 异步调用:CompletableFuture
 */
public class FutureDemo {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    //没有返回值异步回调
    CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()->{
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+"completableFuture.Void");
    });
    System.out.println("11111");
    completableFuture.get();//获取执行结果,会阻塞
    System.out.println("22222");

    //有返回值
  /*  CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println(Thread.currentThread().getName()+"supplyAsync.Integer");
      return 1024;
    });
    completableFuture.whenComplete((t,u)->{
      System.out.println(t+"======="+u);//t正常返回结果,u是异常信息
    }).exceptionally((e)->{
      e.getMessage();
      return 233;
    }).get();*/

  }

}
