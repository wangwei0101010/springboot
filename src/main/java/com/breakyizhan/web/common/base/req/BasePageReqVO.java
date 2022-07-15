package com.breakyizhan.web.common.base.req;


import java.io.Serializable;
import lombok.Data;

/**
 * BasePageRequestVO
 * 基础分页入参
 *
 * @author ZhengYu
 * @date 2019/5/29 17:33
 */
@Data
public class BasePageReqVO implements Serializable {

    private Integer pageNo;

    private Integer pageSize;
}
