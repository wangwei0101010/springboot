package com.breakyizhan.web.common.exception;
/**
 *<p>Title:ParameterException</p>
 *<p>Description:自定义业务异常,参数异常,状态码400</p>
 */
public class ParameterException extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParameterException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
     
	private final int STATUS=400;

	/**
	 * @return the status
	 */
	public  int getStatus() {
		return STATUS;
	}
	
	
}
