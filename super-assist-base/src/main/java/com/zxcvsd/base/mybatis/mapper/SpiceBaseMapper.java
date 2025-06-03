package com.zxcvsd.base.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface SpiceBaseMapper<T> extends BaseMapper<T> {
    void insertBatchSomeColumn(List<T> entityList);
}
