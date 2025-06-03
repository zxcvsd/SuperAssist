package com.zxcvsd.payment.controller;

import com.zxcvsd.base.result.ResponseResult;
import com.zxcvsd.payment.model.payConfig.dto.PayConfigDto;
import com.zxcvsd.payment.model.payConfig.vo.DeleteListPayConfigVo;
import com.zxcvsd.payment.model.payConfig.vo.DeletePayConfigVo;
import com.zxcvsd.payment.model.payConfig.vo.InsertPayConfigVo;
import com.zxcvsd.payment.model.payConfig.vo.UpdatePayConfigVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "支付配置管理")
@RestController
@RequestMapping("/payConfig")
public class PayConfigController {

    @ApiOperation("新增")
    @PostMapping("/insert")
    public ResponseResult<Void> insert(@RequestBody InsertPayConfigVo insertPayConfigVo) {
        return null;
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public ResponseResult<Void> delete(@RequestBody DeletePayConfigVo deletePayConfigVo) {
        return null;
    }

    @ApiOperation("批量删除")
    @PostMapping("/deleteList")
    public ResponseResult<Void> deleteList(@RequestBody DeleteListPayConfigVo deleteListPayConfigVo) {
        return null;
    }

    @ApiOperation("修改")
    @PostMapping("/update")
    public ResponseResult<Void> update(@RequestBody UpdatePayConfigVo updatePayConfigVo) {
        return null;
    }

    @ApiOperation("查询单个")
    @GetMapping("/selectOne")
    public ResponseResult<PayConfigDto> selectOne(@RequestParam("id") Integer id) {
        return null;
    }

    @ApiOperation("查询多个")
    @GetMapping("/selectList")
    public ResponseResult<?> selectList() {
        return null;
    }

    @ApiOperation("查询分页")
    @GetMapping("/selectPage")
    public ResponseResult<?> selectPage(@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize) {
        return null;
    }

}
