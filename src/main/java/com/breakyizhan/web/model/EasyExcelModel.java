/**
 * FileName: EasyExcelModel
 * Author:   Administrator
 * Date:     2020/4/27 10:42
 * Description: ali表格导入导出
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
/**
 * 〈一句话功能简述〉<br> 
 * 〈ali表格导入导出〉
 *
 * @author Administrator
 * @create 2020/4/27
 * @since 1.0.0
 */


public class EasyExcelModel {
    private String uid;
    private String name;
    private Integer age;
    private Date birthday;

    public EasyExcelModel() {
    }

    public EasyExcelModel(String uid, String name, Integer age, Date birthday) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
