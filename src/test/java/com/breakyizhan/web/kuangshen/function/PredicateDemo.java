package com.breakyizhan.web.kuangshen.function;

import java.util.function.Predicate;
/**
 * 断定型接口,有一个输入参数,返回值只能是boolean
 * */
public class PredicateDemo {

  public static void main(String[] args) {

/*    Predicate predicate = new Predicate<String>() {
      //判断字符串是否为空
      @Override
      public boolean test(String s) {
        return s.isEmpty();
      }
    };*/
  //  Predicate<String> predicate = String::isEmpty;
    Predicate<String> predicate = (str) ->{return str.isEmpty();};
        System.out.println(predicate.test(""));
  }

}
