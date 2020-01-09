package com.breakyizhan.web.common.base;

import java.util.List;

/**
 *<p>Title:BaseDao</p>
 *<p>Description:公共Dao</p>

 */
public interface BaseDao<T> {

	    T selectByPrimaryKey(String tid);

		long findAllListCount(T record);

		List<T> findAllList(T record);
	    
}
