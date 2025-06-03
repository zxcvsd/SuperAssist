package com.zxcvsd.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 支付渠道枚举类
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PayWayEnum {

    AliPay(1, "支付宝"),
    WxPay(2, "微信"),
    ;

    private int code;
    private String message;
}
