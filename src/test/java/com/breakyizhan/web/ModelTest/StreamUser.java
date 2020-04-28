/**
 * FileName: StreamUser
 * Author:   Administrator
 * Date:     2020/4/28 10:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.ModelTest;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/4/28
 * @since 1.0.0
 */
public class StreamUser {
    private String name;
    private String area;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public StreamUser() {
    }

    public StreamUser(String name, String area, Integer age) {
        this.name = name;
        this.area = area;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", age=" + age +
                '}';
    }

}
