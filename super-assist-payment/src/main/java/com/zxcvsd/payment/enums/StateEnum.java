package com.zxcvsd.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 状态枚举类
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum StateEnum {

    STATE_OFF(0, "未启用"),
    STATE_ON(1, "启用"),
    ;

    private int code;
    private String message;
}
