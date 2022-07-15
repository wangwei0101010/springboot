package com.breakyizhan.web.entity.enumdefi;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/*
* 主题操作类型
* */
@Getter
public enum IotDeviceStatusEnum implements DictEnum {

    IN_USE(1, "已启用"),
    ACTIVATED(2, "已激活"),
    NOT_IN_USE(3, "已禁用"),
    IS_DELETE(4, "已删除")
    ;

    @EnumValue
    private int value;
    private String desc;

    IotDeviceStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
