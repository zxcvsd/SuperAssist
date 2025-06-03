package com.zxcvsd.payment.model.payConfig.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteListPayConfigVo {
    private List<Integer> ids;
}
