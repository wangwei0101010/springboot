package com.breakyizhan.web.kuangshen.forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Test {


  public static void main(String[] args) throws ExecutionException, InterruptedException {
    //test1();//sum=499999999500000000时间6846
    //test2();//sum=499999999500000000时间6483
    test3();//sum=500000000500000000时间251(并行)/sum=500000000500000000时间491(串行)

  }


  //普通程序猿
  public static void test1(){
    long start = System.currentTimeMillis();
    Long sum = 0L;
    for (Long i = 1L; i <= 10_0000_0000; i++) {
      sum += i;
    }
    long end = System.currentTimeMillis();
    System.out.println("sum="+sum+"时间"+(end-start));
  }

  //forkJoin
  public static void test2() throws ExecutionException, InterruptedException {
    long start = System.currentTimeMillis();
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    ForkJoinTask<Long> forkJoinTest = new ForkJoinTest(0L, 10_0000_0000L);
    ForkJoinTask<Long> submit = forkJoinPool.submit(forkJoinTest);//异步提交任务
    Long sum = submit.get();
    long end = System.currentTimeMillis();
    System.out.println("sum="+sum+"时间"+(end-start));
  }

  public static void test3(){
    long start = System.currentTimeMillis();
    //Stream并行流
    long reduce = LongStream.rangeClosed(0L, 10_0000_0000).parallel().reduce(0, Long::sum);
    long end = System.currentTimeMillis();
    System.out.println("sum="+reduce+"时间"+(end-start));
  }

}
