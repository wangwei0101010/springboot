package com.breakyizhan.web.kuangshen.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * 枚举本身也是一个class类
 * 反射不能破坏枚举!!!!!!!!!!!!!
 * */
public enum  EnumSingle {

  INSTANCE;
  public EnumSingle getInstance() {
    return INSTANCE;
  }

}

class Test{

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    EnumSingle instance = EnumSingle.INSTANCE;
    Class<EnumSingle> enumSingleClass = EnumSingle.class;
    Constructor<EnumSingle> declaredConstructor = enumSingleClass.getDeclaredConstructor(null);
    declaredConstructor.setAccessible(true);
    EnumSingle enumSingle = declaredConstructor.newInstance();
    EnumSingle enumSingle2 = declaredConstructor.newInstance();
    System.out.println(enumSingle);
    System.out.println(enumSingle2);

  }
}