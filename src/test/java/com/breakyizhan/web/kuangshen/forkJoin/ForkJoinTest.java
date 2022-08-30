package com.breakyizhan.web.kuangshen.forkJoin;

import java.util.concurrent.RecursiveTask;

/**
 * 什么是forkJoin(分支合并),JDK1.7出现的,并行执行任务提高效率,大数据量!
 * forkJoin特点:工作窃取 ​	例如A B两个线程
 * B执行完了,可以窃取A的任务,这里面维护的是双端队列 如何使用: 1.forkJoinPool通过它来执行 2.计算任务 forkJoinPool.execute(ForkJoinTask
 * task)
 */
public class ForkJoinTest extends RecursiveTask<Long> {

  private Long start;
  private Long end;
  //临界值
  private Long temp = 10000L;

  public ForkJoinTest(Long start, Long end) {
    this.start = start;
    this.end = end;
  }

  public void test() {

  }

  //计算方法
  @Override
  protected Long compute() {
    if (end - start > temp) {
      Long sum = 0L;
      for (Long i = start; i < end; i++) {
        sum += i;
      }
      System.out.println(sum);
    } else {
      long middle = (start + end)/2;//中间值
      ForkJoinTest forkJoinTest1 = new ForkJoinTest(start, middle);
      //拆分任务,把任务压入线程队列
      forkJoinTest1.fork();
      ForkJoinTest forkJoinTest2 = new ForkJoinTest(middle+1, end);
      forkJoinTest2.fork();
      return forkJoinTest1.join() + forkJoinTest2.join();
    }

    return null;
  }
}
