package com.breakyizhan.web.common.dataSource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *<p>Title:DataAop</p>
 *<p>Description:通过切面动态切换数据源</p>

 */
@Component
@Aspect
public class DataAop {
   
	@Before("execution(* com.breakyizhan.web.service.impl.*.*(..))")
	public void switchDataSource(JoinPoint pjp) throws Throwable{
		Signature signature = pjp.getSignature();    
		MethodSignature methodSignature = (MethodSignature)signature;  
		Method targetMethod = methodSignature.getMethod();
		Method realMethod = pjp.getTarget().getClass().getDeclaredMethod(signature.getName(), targetMethod.getParameterTypes());
		    //首先判断方法级别
	    	CustomDataSource cds=realMethod.getAnnotation(CustomDataSource.class);
	    	if(cds==null){ //判断类级别
	    		 cds= AnnotationUtils.findAnnotation(realMethod.getDeclaringClass(), CustomDataSource.class);
	    	}
	    	if(cds==null){
	    		/*DataSourceContextHolder.setDbType(DataSourceName.DATA_CHAT);*/
	    		return;
	    	}
	    	String dataSourceName=cds.value();
	    	if(dataSourceName!=null&&!dataSourceName.equals(""))
	    	DataSourceContextHolder.setDbType(dataSourceName);
	}
	
}
