package com.breakyizhan.web.TestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射,动态创建对象
public class test6 {

  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

    //获得class对象
    Class  c1 = Class.forName("com.breakyizhan.web.TestAnnotation.User");

    //构造一个对象
    User user = (User)c1.newInstance();//本质上调用了无参构造器 ,删除无参构造器报错,
    System.err.println(user);

    //通过构造器创建对象
    Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
    Object user2 = constructor.newInstance("王伟", 1, 1);
    System.err.println(user2);

    //通过反射调用普通构造方法
    User user3 = (User)c1.newInstance();
    //通过反射获取一个方法
    Method setName = c1.getDeclaredMethod("setName", String.class);
    //invoke激活的意思,第一个参数传对象,第二个是方法的值
    setName.invoke(user3, "wangwei");
    String name = user3.getName();
    System.err.println(name);

    //通过反射操作属性
    User user4 = (User)c1.newInstance();
    Field name1 = c1.getDeclaredField("name");
    //关闭安全检测,不然提示User with modifiers "private",不能操作私有属性
    name1.setAccessible(true);
    name1.set(user4,"wangwei4");
    System.err.println(user4.getName());


  }

}
