package com.breakyizhan.web;

import static java.lang.Math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.Test;

/**
 * 函数式接口
 *
 * 函数式接口：函数从定义上来说就是某种对应的关系，假设其中的元素为x，对A中的元素x施加对应法则f，记作f（x），得到另一数集B，假设B中的元素为y，则y与x之间的等量关系可以用y=f（x）。函数式接口就是能帮我们完成某种功能的接口。通常用@FunctionalInterface来表明一个接口是函数式接口。java中有很多函数式接口。今天主要学习jdk1.8中内置的四大核心函数式接口。
 *
 *1.消费型接口，接收一个T类型的参数，无返回 public interface Consumer<T>
 *2.供给型接口，获取参数为T类型的值  public interface Supplier<T>
 *3.功能型接口，接收一个T类型的参数,并返回R类型的结果 public interface Function<T, R>
 *4.断言型接口，判断T类型的参数是否满足条件。 public interface Predicate<T>
 *
 * */
public class lambdaFunctionDemo {

  //消费型接口测试
  @Test
  public void Test01() {
    consumer(98.5, x -> System.out.println("今天吃了一条鱼，消费了" + x + "元"));
  }
  public void consumer(Double money, Consumer<Double> doubleConsumer) {
    doubleConsumer.accept(money);
  }

  //供给型接口测试
  @Test
  public void Test02() {
    //产生三个10以内的随机数，并打印出来
    List<Integer> list = getList(3, () -> (int) (random() * 10));
    list.forEach(x -> System.out.println(x));
  }
  //获取number个满足条件的数字
  public List<Integer> getList(int number, Supplier<Integer> supplier) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      int n = supplier.get();
      list.add(n);
    }
    return list;
  }

  //功能性接口测试
  @Test
  public void Test03() {
    //获取abcdefg字符串的长度
    Integer length = getLength("abcdefg", x -> x.length());
    System.out.println(length);
  }
  //获取字符串的长度
  public Integer getLength(String str, Function<String, Integer> function) {
    return function.apply(str);
  }

  //断言型接口测试
  @Test
  public void Test04() {
    List<Integer> list = Arrays.asList(45, 56, 48, 49, 65, 80);
    //找出大于60的数
    List<Integer> integerList = getList(list, s -> s > 60);
    integerList.forEach(x -> System.out.println(x));
  }
  //将满足条件的加入返回
  public List<Integer> getList(List<Integer> list, Predicate<Integer> predicate) {
    List<Integer> integers = new ArrayList<>();
    for (Integer i : list) {
      if (predicate.test(i)) {
        integers.add(i);
      }
    }
    return integers;
  }


}
