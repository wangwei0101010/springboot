package com.breakyizhan.web.Thread.kuangshen;

public class test1 {

  public static void main(String[] args) {
    //获取cpu的核数
    //CPU密集型,IO密集型
    System.out.println(Runtime.getRuntime().availableProcessors());
    //thread6种状态
    Thread.State.values();
  }

}
