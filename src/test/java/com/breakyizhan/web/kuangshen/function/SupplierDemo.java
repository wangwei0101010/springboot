package com.breakyizhan.web.kuangshen.function;

import java.util.function.Supplier;

/**
 * 供给者接口
 * */
public class SupplierDemo {

  public static void main(String[] args) {
 /*   Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "21312";
      }
    };*/
    Supplier<String> supplier = ()->{
    return "21312";
    };
    System.out.println(supplier.get());
  }

}
