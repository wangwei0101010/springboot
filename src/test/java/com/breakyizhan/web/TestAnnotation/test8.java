package com.breakyizhan.web.TestAnnotation;

import com.breakyizhan.web.TestAnnotation.test8.Fieldwang;
import com.breakyizhan.web.TestAnnotation.test8.Tablewang;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import lombok.Data;
import lombok.ToString;

//练习反射操作注解
public class test8 {

  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
    Class c1 = Class.forName("com.breakyizhan.web.TestAnnotation.Student2");

    //通过反射获取注解
    Annotation[] annotations = c1.getAnnotations();
    for (Annotation annotation : annotations) {
      System.out.println(annotation);
    }

    //获取注解的value的值
    Tablewang annotation = (Tablewang)c1.getAnnotation(Tablewang.class);
    String value = annotation.value();
    System.out.println(value);

    //获取类指定的注解
    Field field = c1.getDeclaredField("name");
    Fieldwang annotation1 = field.getAnnotation(Fieldwang.class);
    System.out.println(annotation1.columnName());
    System.out.println(annotation1.type());
    System.out.println(annotation1.length());


  }


  //类的注解
  @Target(ElementType.TYPE)
  @Retention(RetentionPolicy.RUNTIME)
  @interface Tablewang{
    String value();
  }

  //属性的注解
  @Target(ElementType.FIELD)
  @Retention(RetentionPolicy.RUNTIME)
  @interface Fieldwang{
    String columnName();
    String type();
    int length();
  }


}

@Data
@ToString
@Tablewang("db_student")
class Student2 {
  @Fieldwang(columnName ="db_id",type ="int",length =10)
  private int id;
  @Fieldwang(columnName ="db_age",type ="int",length =10)
  private int age;
  @Fieldwang(columnName ="db_name",type ="varchar",length =5)
  private String name;
}
