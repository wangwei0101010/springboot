package com.breakyizhan.web.TestAnnotation;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
public class test7 {

  public void test01(Map<String, User> map, List<User> list) {
    System.err.println("test01");
  }

  public Map<String, User> test02() {
    System.err.println("test02");
    return null;
  }

  public static void main(String[] args) throws NoSuchMethodException {
    //获取泛型参数类型
    Method method = test7.class.getMethod("test01", Map.class, List.class);
    Type[] genericParameterTypes = method.getGenericParameterTypes();
    for (Type genericParameterType : genericParameterTypes) {
      System.err.println(genericParameterType);
      if (genericParameterType instanceof ParameterizedType) {
        Type[] actualTypeArguments = ((ParameterizedType) genericParameterType)
            .getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
          System.err.println(actualTypeArgument);
        }
      }
    }
    System.err.println("---------");

    //获取返回参数类型
    method = test7.class.getMethod("test02", null);
    Type genericReturnType = method.getGenericReturnType();
    if (genericReturnType instanceof ParameterizedType) {
      Type[] actualTypeArguments = ((ParameterizedType) genericReturnType)
          .getActualTypeArguments();
      for (Type actualTypeArgument : actualTypeArguments) {
        System.err.println(actualTypeArgument);
      }
    }

  }

}
