package com.breakyizhan.web.Thread;
/**
 * 测试线程停止
 * 休眠不会释放锁
 * 常用于倒计时,模拟网络延时发现代码多线程问题等情况的出现
 * */
public class ThreadTestSleep implements Runnable {


  private boolean flag = true;

  @Override
  public void run() {
   int i = 0;
   while (flag){
     System.err.println("run....."+ i++);
   }
  }

}
