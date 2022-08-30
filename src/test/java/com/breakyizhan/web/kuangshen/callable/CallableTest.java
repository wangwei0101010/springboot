package com.breakyizhan.web.kuangshen.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {

  public static void main(String[] args) {

  //  new Thread().start();//怎么启动callable
//callable和Runnable关系: runnable有个实现类FutureTask,FutureTask构造方法传参有个Callable
    MyThread thread = new MyThread();
    FutureTask<String> futureTask = new FutureTask<>(thread);
    new Thread(futureTask, "A").start();
    new Thread(futureTask, "B").start();//结果有缓存,只打印一次 返回结果==>



    try {
      String s = futureTask.get();//get方法可能会产生阻塞,如果是耗时操作,或者使用异步通讯处理
      System.out.println("返回结果==>"+s);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }

}


class MyThread implements Callable<String> {

  @Override
  public String call() {
    System.out.println("call()");
    return "123";
  }
}
