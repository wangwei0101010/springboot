package com.breakyizhan.web.TestAnnotation;

//测试class类的创建方式有哪些
public class test3 {

  public static void main(String[] args) throws ClassNotFoundException {
    Person person = new Student();
    System.err.println("这个人是"+person.name);

    //方式1:通过对象获得
    Class c1 = person.getClass();
    System.err.println(c1.hashCode());
    //方式2:forname获得
    Class c2 = Class.forName("com.breakyizhan.web.TestAnnotation.Student");
    System.err.println(c2.hashCode());

    //方式3:通过类名.class获得
    Class c3 = Student.class;
    System.err.println(c3.hashCode());

    //获得方式4 基本内置类型的包装类都有一个Type属性
    Class c4 = Integer.TYPE;
    System.err.println(c4);

    //获得父类的类型
    Class c5 = c1.getSuperclass();
    System.err.println(c5);


  }

}

class Person{
  public String name;

  public Person() {
    System.err.println("person无参");
  }

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }
}

class Student extends Person{
  public Student() {
    this.name = "学生";
  }
}

class Teacher extends Person{
  public Teacher() {
    this.name = "老师";
  }
}