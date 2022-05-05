package com.breakyizhan.web.TestAnnotation;

//什么叫反射
public class test2 extends Object{

  public static void main(String[] args) throws ClassNotFoundException {
    Class c1 = Class.forName("com.breakyizhan.web.TestAnnotation.User");
    System.err.println(c1);

    //一个类在内存中只有一个class对象
    //一个类被加载后,类的整个结果都会被封装在class对象中
    Class c2 = Class.forName("com.breakyizhan.web.TestAnnotation.User");
    System.err.println(c1.hashCode());
    System.err.println(c2.hashCode());

  }



}

class User{
  private String name;
  private int id ;
  private int age;

  public User(String name, int id, int age) {
    this.name = name;
    this.id = id;
    this.age = age;
  }

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", id=" + id +
        ", age=" + age +
        '}';
  }
}
