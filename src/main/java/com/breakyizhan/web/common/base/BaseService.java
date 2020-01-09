package com.breakyizhan.web.common.base;

import com.breakyizhan.web.common.util.MyResult;

/**
 *<p>Title:BaseService</p>
 *<p>Description:公共Service</p>

 */
public interface BaseService<T> {
	MyResult findAllRecords(T record) throws Exception;

	MyResult findById(String tid) throws Exception;
	
}
