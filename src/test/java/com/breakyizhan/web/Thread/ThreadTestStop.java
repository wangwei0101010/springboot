package com.breakyizhan.web.Thread;
/**
 * 测试线程停止
 * */
public class ThreadTestStop implements Runnable {


  private boolean flag = true;

  @Override
  public void run() {
   int i = 0;
   while (flag){
     System.err.println("run....."+ i++);
   }
  }

  public void stop (){
    this.flag=false;
  }

  public static void main(String[] args) {

    ThreadTestStop threadTest01 = new ThreadTestStop();
    new Thread(threadTest01).start();

    for (int i = 0;i<1000;i++){
      System.err.println("main"+i);
      if(i==900){
        threadTest01.stop();
        System.err.println("线程停止.......");
      }
    }

  }
}
