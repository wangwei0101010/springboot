package com.breakyizhan.web.common.base.res;

import com.baomidou.mybatisplus.core.metadata.IPage;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BasePageResVO
 * 基础分页出参
 *
 * @author ZhengYu
 * @date 2019/5/29 17:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePageResVO<T> implements Serializable {

    private Integer pageNo;

    private Integer pageSize;

    private Integer totalPage;

    private Long totalCount;

    private List<T> rows;

    public BasePageResVO(int pageNo, int pageSize, long totalCount, List<T> rows) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage();
        this.rows = rows;
    }

    public BasePageResVO(IPage<T> page) {
        this.rows = page.getRecords();
        this.totalCount = page.getTotal();
        this.pageSize = (int)page.getSize();
        this.pageNo = (int) page.getCurrent();
        this.totalPage = (int) page.getPages();
    }

    private Integer totalPage() {
        if (totalCount == 0 || pageSize == 0) {
            return 1;
        }
        return (int) Math.ceil((float) totalCount / pageSize);
    }
}
