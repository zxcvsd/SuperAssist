package com.zxcvsd.base.web.result;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {
    private Long total;
    private Long currentPage;
    private Long pageSize;
    private List<T> list;

    public PageResult(IPage<T> page) {
        this.total = page.getTotal();
        this.currentPage = page.getCurrent();
        this.pageSize = page.getSize();
        this.list = page.getRecords();
    }
}
