package com.breakyizhan.web.myTest;
//测试守护线程
public class TestDaemon {

  public static void main(String[] args) {
    God god = new God();
    You you = new You();

    Thread thread = new Thread(god);
    thread.setDaemon(true);//默认false

    thread.start();//守护线程启动

    new Thread(you).start();//用户线程启动

  }
}
  class God implements Runnable{
    @Override
    public void run() {
      while (true){
        System.err.println("上地保佑着你");
      }
    }
  }

  class You implements Runnable{
    @Override
    public void run() {
      for (int i = 0; i<36500; i++) {
        System.err.println("每天开开心心");
      }
      System.err.println("goodbye!");
    }
  }

