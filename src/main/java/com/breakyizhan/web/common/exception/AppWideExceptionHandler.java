package com.breakyizhan.web.common.exception;


import com.breakyizhan.web.common.util.MyResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *<p>Title:AppWideExceptionHandler</p>
 *<p>Description:控制层异常统一处理类</p>

 */
@RestControllerAdvice
public class AppWideExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	public MyResult exception(HttpServletRequest request, HttpServletResponse response, Exception ex){
		String data="异常名:"+ex.getClass()+"||方法名:"+ex.getStackTrace()[0].getMethodName()+"||类名:"+ex.getStackTrace()[0].getClassName()+"||行数:"+ex.getStackTrace()[0].getLineNumber();
		return MyResult.exception(data,ex.getMessage(),500);
	}
	@ExceptionHandler(ParameterException.class)
	public MyResult parameterException(ParameterException ex){
		return MyResult.exception(ex.getMessage(),"参数异常", ex.getStatus());
	}
}
