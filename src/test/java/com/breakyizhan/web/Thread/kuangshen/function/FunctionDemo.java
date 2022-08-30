package com.breakyizhan.web.Thread.kuangshen.function;

import java.util.function.Function;

/**
 * Function 函数型接口 只要是函数式接口,就能用lambda表达式简化
 */
public class FunctionDemo {

  public static void main(String[] args) {
    //工具类:输出输入的值
/*    Function function = new Function<String,String>() {
      @Override
      public String apply(String o) {
        return o;
      }
    };*/
    Function<String, String> function = (str) -> {
      return str;
    };
    Object apply = function.apply("123");
    System.out.println(apply);
  }

}
