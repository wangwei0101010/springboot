package com.breakyizhan.web.TestAnnotation;

import java.lang.annotation.ElementType;

//所有类型的class
public class test4 {

  public static void main(String[] args) {
    Class c1 = Object.class;//类
    Class c2 = Comparable.class;//接口
    Class c3 = String[].class;//一维数组
    Class c4 = int[][].class;//二维数组
    Class c5 = Override.class;//注解
    Class c6 = ElementType.class;//枚举
    Class c7 = Integer.class;//基本数据类型
    Class c8 = void.class;//void
    Class c9 = Class.class;//class

    System.err.println(c1);
    System.err.println(c2);
    System.err.println(c3);
    System.err.println(c4);
    System.err.println(c5);
    System.err.println(c6);
    System.err.println(c7);
    System.err.println(c8);
    System.err.println(c9);


  }


}
