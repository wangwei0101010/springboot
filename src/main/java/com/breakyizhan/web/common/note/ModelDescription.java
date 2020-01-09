package com.breakyizhan.web.common.note;

import java.lang.annotation.*;

/**
 *<p>Title:ModelDescription</p>
 *<p>Description:对象描述</p>

 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ModelDescription {
	String value();
	String key();
}
