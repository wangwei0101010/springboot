package com.breakyizhan.web.kuangshen.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Executors 工具类 3大方法
/**
 * 自定义线程池,最大现场到底如何定义
 * 1.cpu密集型 几核就是几,可以保持cpu效率最高,根据代码获取 Runtime.getRuntime().availableProcessors()方法获取
 * 2.IO密集型,如15个大型任务,io十分占资源.判断io线程有多少个,一般2倍大小
 *
 * */
/**
 * 4中拒绝策略
 * new ThreadPoolExecutor.AbortPolicy());//银行满了,还有人进来,不处理这个人的了,抛出异常,默认的
 * new ThreadPoolExecutor.CallerRunsPolicy());//哪来的去哪里,这里是main去执行
 * new ThreadPoolExecutor.DiscardPolicy());//队列满了,丢弃任务,不会抛出异常
 * new ThreadPoolExecutor.DiscardOldestPolicy());//队列满了,尝试和第一个竞争,不会抛出异常,有尝试机制
 */
public class Demo01 {

  public static void main(String[] args) {
    System.out.println("获取cpu的核数:"+Runtime.getRuntime().availableProcessors());
    //ExecutorService threadPool = Executors.newSingleThreadExecutor();//单个线程
    //ExecutorService threadPool =  Executors.newFixedThreadPool(5);//固定线程池大小
    //ExecutorService threadPool = Executors.newCachedThreadPool();//可伸缩的
    //自定义线程池
    ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
        2,
        Runtime.getRuntime().availableProcessors(),//cpu核数
        3,
        TimeUnit.SECONDS,
        new LinkedBlockingQueue<>(3),
        Executors.defaultThreadFactory(),
        //new ThreadPoolExecutor.AbortPolicy());//银行满了,还有人进来,不处理这个人的了,抛出异常,默认的
        //new ThreadPoolExecutor.CallerRunsPolicy());//哪来的去哪里,这里是main去执行
        //new ThreadPoolExecutor.DiscardPolicy());//队列满了,丢弃任务,不会抛出异常
        new ThreadPoolExecutor.DiscardOldestPolicy());//队列满了,尝试和第一个竞争,不会抛出异常,有尝试机制

    try {
      //最大线程数= max + Queue = 8
      // 超过8触发拒绝策略,报异常 java.util.concurrent.RejectedExecutionException
      for (int i = 1; i <= 20; i++) {
        threadPool.execute(() -> {
          System.out.println(Thread.currentThread().getName() + "  ok");
        });
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      //线程用完要关闭
      threadPool.shutdown();
    }

  }
}











