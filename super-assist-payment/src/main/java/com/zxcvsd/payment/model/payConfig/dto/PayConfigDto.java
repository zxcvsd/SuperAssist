package com.zxcvsd.payment.model.payConfig.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayConfigDto {
    private Integer id;
    private Integer groupId;
    private Integer payWay;
    @ApiModelProperty("配置信息，只有在查询单个时才会返回")
    private String setting;
    private Integer state;
    private Long createTime;
    private Long updateTime;
}
