package com.breakyizhan.web.kuangshen.Stream;

import java.util.Arrays;
import java.util.List;

/**
 * 题目要求:1分钟完成,只能用一行代码实现! 现有5个用户!筛选 1. ID必须是偶数
 * 2. 年龄必须大于23岁
 * 3. 用户名转换为大写字母
 * 4. 用户名字母倒排
 * 5. 只输出一个用户!
 */
public class Test {

  public static void main(String[] args) {

    UserStream u1 = new UserStream(1, "a", 21);
    UserStream u2 = new UserStream(2, "b", 22);
    UserStream u3 = new UserStream(3, "c", 23);
    UserStream u4 = new UserStream(4, "d", 24);
    UserStream u5 = new UserStream(6, "e", 25);

    //集合就是存储
    List<UserStream> list = Arrays.asList(u1, u2, u3, u4, u5);

    //计算交给stream流
    list.stream()
        .filter(u -> u.getId() % 2 == 0)
        .filter(u -> u.getAge() > 23)
        .map(u -> u.getName().toUpperCase())
        .sorted((uu1,uu2)->{return uu2.compareTo(uu1);})
        .limit(1)
        .forEach(System.out::print);


  }

}
