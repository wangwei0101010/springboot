package com.breakyizhan.web.kuangshen.function;

import java.util.function.Consumer;

/**
 * 消费者接口
 * */
public class ConsumerDemo {

  public static void main(String[] args) {
 /*   Consumer consumer = new Consumer<String>() {
      @Override
      public void accept(String o) {
        System.out.println(o);
      }
    };*/
    Consumer consumer = (str) ->{ System.out.println(str);};
    consumer.accept("sdfs");
  }

}
