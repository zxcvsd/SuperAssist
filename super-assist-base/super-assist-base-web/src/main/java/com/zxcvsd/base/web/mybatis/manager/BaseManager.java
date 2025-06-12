package com.zxcvsd.base.web.mybatis.manager;

import com.zxcvsd.base.web.mybatis.mapper.SpiceBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("all") // 忽略所有异常
public abstract class BaseManager<T, ID extends Serializable> {

    @Autowired
    private SpiceBaseMapper<T> spiceBaseMapper;

    /**
     * 新增
     */
    public int insert(T entity) {
        return spiceBaseMapper.insert(entity);
    }

    /**
     * 批量新增
     */
    public void insetList(List<T> entityList) {
        spiceBaseMapper.insertBatchSomeColumn(entityList);
    }

    /**
     * 删除
     */
    public int deleteById(ID id) {
        return spiceBaseMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public int deleteByIds(List<ID> ids) {
        return spiceBaseMapper.deleteBatchIds(ids);
    }

    /**
     * 删除所有
     */
    public int deleteAll() {
        return spiceBaseMapper.delete(null);
    }

    /**
     * 修改
     */
    public int updateById(T entity) {
        return spiceBaseMapper.updateById(entity);
    }

    /**
     * 查询
     */
    public T selectById(ID id) {
        return spiceBaseMapper.selectById(id);
    }

    /**
     * 批量查询
     */
    public List<T> selectByIds(List<ID> ids) {
        return spiceBaseMapper.selectBatchIds(ids);
    }

    /**
     * 查询所有
     */
    public List<T> selectAll() {
        return spiceBaseMapper.selectList(null);
    }
}
