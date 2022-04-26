package com.breakyizhan.web.myTest.syn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

//不安全取钱
//两个人去取钱
public class UnsafeBank {

  public static void main(String[] args) {
    //账户
    Account account = new Account(100,"基金");

    Drawing you = new Drawing(account,50,"你");
    Drawing me = new Drawing(account,100,"我");

    you.start();
    me.start();

  }

}

@Data
@AllArgsConstructor
class Account {
  int money;//余额
  String name;

}

@Data
//银行 模拟取款
class Drawing extends Thread {

  public Drawing(Account account, int drawingMoney ,String name) {
    super(name);
    this.drawingMoney = drawingMoney;
    this.account = account;
  }

  Account account;//账户
  int drawingMoney;//取了多少钱
  int nowMoney;//现在有多少钱

  @SneakyThrows
  @Override
  //取钱
  public void run() {
    if (account.money - drawingMoney < 0) {
      System.err.println("钱不够");
      return;
    }

    Thread.sleep(1000);
    //卡余额 = 余额-取钱
    account.money =  account.money - drawingMoney;
    //手里的钱
    nowMoney = nowMoney+drawingMoney;
    System.err.println("余额"+account.money);
    System.err.println(this.getName()+"手里的钱"+nowMoney);
  }
}