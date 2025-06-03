package com.zxcvsd.payment.model.payConfig.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsertPayConfigVo {
    @ApiModelProperty("该支付配置所属group")
    private Integer groupId;
    @ApiModelProperty("支付渠道")
    private Integer payWay;
    @ApiModelProperty("配置信息")
    private String setting;
}
