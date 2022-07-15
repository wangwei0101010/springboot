package com.breakyizhan.web.entity.enumdefi;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/*
* 数据格式
* */
@Getter
public enum IotDeviceSubGroupStatusEnum implements DictEnum {

    PARENT(1, "查询父级"),
    SUB(2, "查询子级")
    ;
    @EnumValue
    private int value;
    private String desc;

    IotDeviceSubGroupStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
