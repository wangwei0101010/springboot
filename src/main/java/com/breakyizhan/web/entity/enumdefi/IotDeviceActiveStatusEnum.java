package com.breakyizhan.web.entity.enumdefi;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/*
* 主题操作类型
* */
@Getter
public enum IotDeviceActiveStatusEnum implements DictEnum {

    NOT_ACTIVATED(1, "未激活"),
    OFF_LINE(2, "离线"),
    ON_LINE(3, "在线")
    ;

    @EnumValue
    private int value;
    private String desc;

    IotDeviceActiveStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
