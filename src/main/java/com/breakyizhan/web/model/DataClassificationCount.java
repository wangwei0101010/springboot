package com.breakyizhan.web.model;

/**
 * @Description 数据分类统计对象
 * @Author qimy
 * @Date 2018/5/17 11:27
 **/


public class DataClassificationCount {

    private String name;
    private int value;
    private int newData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNewData() {
        return this.newData;
    }

    public void setNewData(int newData) {
        this.newData = newData;
    }
}
