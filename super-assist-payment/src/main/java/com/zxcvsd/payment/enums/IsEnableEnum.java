package com.zxcvsd.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 是否启用枚举类
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum IsEnableEnum {

    Enable_Off(0, "未启用"),
    Enable_On(1, "启用"),
    ;

    private int code;
    private String message;
}
