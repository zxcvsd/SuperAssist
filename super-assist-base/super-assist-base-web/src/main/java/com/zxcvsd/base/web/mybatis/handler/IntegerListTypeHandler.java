package com.zxcvsd.base.web.mybatis.handler;

import com.alibaba.fastjson.TypeReference;
import com.zxcvsd.base.web.mybatis.handler.base.ListTypeHandler;

import java.util.List;

public class IntegerListTypeHandler extends ListTypeHandler<Integer> {

    @Override
    protected TypeReference<List<Integer>> specificType() {
        return new TypeReference<List<Integer>>(){};
    }

}
