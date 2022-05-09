package com.breakyizhan.web.TestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//反射获取类的信息
public class test5 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
    Class c1 = Class.forName("com.breakyizhan.web.TestAnnotation.User");
    //获取类的名字
    System.err.println(c1.getName());//获取包名+类名
    System.err.println(c1.getSimpleName());//获取类名

    //获取类的属性
    Field[] fields = c1.getFields();//只能找到public属性
    Field[] fields1 = c1.getDeclaredFields();//能找到所有的属性
    for (Field field : fields1) {
      System.err.println(field);
    }
    //获取指定属性的值
    Field name = c1.getDeclaredField("name");
    System.err.println(name);

    //获取类的方法
    Method[] methods = c1.getMethods();//获取本类和父类的全部public方法
    for (Method method : methods) {
      System.err.println("getMethods  "+method);
    }
    Method[] methods2 = c1.getDeclaredMethods();//获取本类的所有方法,包括私有的
    for (Method method : methods2) {
      System.err.println("getDeclaredMethods  "+method);
    }

    //获取指定方法
    //因为有重载机制,所有需要通过parameterTypes来区分
    Method getName = c1.getMethod("getName",null);
    Method setName = c1.getMethod("setName",String.class);
    System.err.println("getMethod  "+getName);
    System.err.println("getMethod  "+setName);

    //获取指定构造器
    Constructor[] constructors = c1.getConstructors();
    for (Constructor constructor : constructors) {
      System.err.println("getConstructors  "+constructor);
    }
    Constructor[] declaredConstructors = c1.getDeclaredConstructors();
    for (Constructor declaredConstructor : declaredConstructors) {
      System.err.println("declaredConstructors  "+declaredConstructor);
    }

    //获取指定类型的构造器
    Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class,int.class);
    System.err.println("declaredConstructor  "+declaredConstructor);


  }


}
