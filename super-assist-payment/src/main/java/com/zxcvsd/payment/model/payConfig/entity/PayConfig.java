package com.zxcvsd.payment.model.payConfig.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "payment_pay_config", autoResultMap = true)
public class PayConfig {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer groupId;
    private String title;
    private String description;
    private Integer payWay;
    private String setting;
    private Integer isEnable;
    private Long createTime;
    private Long updateTime;
}
