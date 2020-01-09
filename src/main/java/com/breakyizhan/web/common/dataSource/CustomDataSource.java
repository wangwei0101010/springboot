package com.breakyizhan.web.common.dataSource;

import java.lang.annotation.*;

/**
 *<p>Title:CustomDataSource</p>
 *<p>Description:自定义选择数据源注解(在Service实现层的类或方法上使用该注解切换数据源，方法优先于类)</p>
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomDataSource {
	String value();
}
