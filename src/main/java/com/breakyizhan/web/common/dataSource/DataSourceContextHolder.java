package com.breakyizhan.web.common.dataSource;
/**
 *<p>Title:DataSourceContextHolder</p>
 *<p>Description:数据源切换工具类</p>

 */
public class DataSourceContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
	  
    public static void setDbType(String dbType) {  
           contextHolder.set(dbType);  
    }  
 
    public static String getDbType() {  
           return ((String) contextHolder.get());
    }  
 
    public static void clearDbType() {  
           contextHolder.remove();  
    }
}
