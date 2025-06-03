package com.zxcvsd.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 支付方式枚举类
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PayModeEnum {

    OrderCode(1, "订单码"),
    ComputerWebsite(2, "电脑网站"),
    MobileWebsite(3, "手机网站"),
    ;

    private int code;
    private String message;
}
