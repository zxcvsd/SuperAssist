package com.zxcvsd.base.web.mybatis.handler;

import com.alibaba.fastjson.TypeReference;
import com.zxcvsd.base.web.mybatis.handler.base.ListTypeHandler;

import java.util.List;

public class StringListTypeHandler extends ListTypeHandler<String> {

    @Override
    protected TypeReference<List<String>> specificType() {
        return new TypeReference<List<String>>(){};
    }

}
