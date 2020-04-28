/**
 * FileName: Java8streamTest
 * Author:   Administrator
 * Date:     2020/4/28 9:58
 * Description: JAVA8 新特性STREAM的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web;

import com.breakyizhan.web.ModelTest.StreamUser;
import com.breakyizhan.web.common.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉<br> 
 * 〈JAVA8 新特性STREAM的使用〉
 *     一个list集合，如果我们想根据里面对象的某个字段分组，则需要遍历，然后分组；
 *
 *              一个list集合，如果我们想根据里面对象的某几个字段分组，求另一个指定字段的和，则需要遍历，然后分组；
 *
 *              java8提供的stream新特性，都可以以很短的代码来解决这种需求。
 *
 * @author Administrator
 * @create 2020/4/28
 * @since 1.0.0
 */
public class Java8streamTest {

    @Test
    public void ListStream(){

        List<StreamUser> userList = new ArrayList<>();
        userList.add(new StreamUser("zhangsan", "beijing", 10));
        userList.add(new StreamUser("zhangsan", "beijing", 20));
        userList.add(new StreamUser("lisi", "shanghai", 30));

        //根据名称分组 单个字段分组
        //Map<String, List<StreamUser>> map1 = userList.stream().collect(Collectors.groupingBy(StreamUser::getName));//也可以下边的方式写
        Map<String, List<StreamUser>> map1 = userList.stream().collect(Collectors.groupingBy(e -> e.getName()));
        System.out.println(map1);
        System.out.println("================");

        // 根据名称和地区分组 多个字段分组
        Map<String, List<StreamUser>> map2 = userList.stream().collect(Collectors.groupingBy(e -> e.getName() + "_" + e.getArea()));
        //Map<String, List<StreamUser>> map2 = userList.stream().collect(Collectors.groupingBy(StreamUser::getName+ "_" + StreamUser::getName));//不能这么写,只支持单个
        System.out.println(map2);
        System.out.println("================");

        //根据名称分组求对应的年龄总和  单列求和比方说：只根据name字段分组求和
        int sum = userList.stream().mapToInt(StreamUser::getAge).sum();
        System.out.println(sum);
        System.out.println("================");

        //根据名称和地区分组求对应的年龄总和
        // 多列求和 比如说：根据name字段和area字段求和
        Map<String, List<StreamUser>> map3 = userList.stream().collect(Collectors.groupingBy(e -> e.getName() + "_" + e.getArea()));
        List<Object> newUserList = map3.keySet().stream().map(key -> {
            StreamUser user = new StreamUser();
            user.setName(key.split("_")[0]);
            user.setArea(key.split("_")[1]);
            Integer sumAge = 0;
            List<StreamUser> eachUserList = map3.get(key);
            for (StreamUser eachUser: eachUserList) {
                sumAge += eachUser.getAge();
            }
            user.setAge(sumAge);
            return user;
        }).collect(Collectors.toList());
        System.out.println(newUserList);

    }

}
