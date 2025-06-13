package com.zxcvsd.base.web.mybatis.handler;

import com.alibaba.fastjson.TypeReference;
import com.zxcvsd.base.web.mybatis.handler.base.ListTypeHandler;

import java.util.List;
import java.util.Map;

public class MapListTypeHandler extends ListTypeHandler<Map<String, Object>> {

    @Override
    protected TypeReference<List<Map<String, Object>>> specificType() {
        return new TypeReference<List<Map<String, Object>>>(){};
    }

}
