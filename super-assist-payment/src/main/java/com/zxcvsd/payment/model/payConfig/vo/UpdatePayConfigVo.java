package com.zxcvsd.payment.model.payConfig.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePayConfigVo {
    private Integer id;
    private Integer payWay;
    private String setting;
}
