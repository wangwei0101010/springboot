package com.breakyizhan.web.myTest.syn;

import lombok.SneakyThrows;

//不安全的买票
//线程不安全,有负数
public class UnsafeBuyTicket {

  public static void main(String[] args) {
    BuyTicket buyTicket = new BuyTicket();

    new Thread(buyTicket,"用户1").start();
    new Thread(buyTicket,"用户2").start();
    new Thread(buyTicket,"用户3").start();
  }

}


class BuyTicket implements Runnable{
  //票
  private  int ticketNums = 10;
  boolean flag = true;


  @SneakyThrows
  @Override
  public void run() {
    //买票
    while (flag){
      buy();
    }
  }

  private void buy() throws InterruptedException {
    //判断是否有票
    if(ticketNums <= 0){
      flag = false;
      return;
    }
    Thread.sleep(100);
    //买票
    System.err.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
  }
}
