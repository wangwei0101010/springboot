package com.breakyizhan.web.common.base;

import com.breakyizhan.web.common.util.UserUtils;
import com.breakyizhan.web.common.model.User;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *<p>Title:BaseController</p>
 *<p>Description:公共Controller</p>

 */
public class BaseController {
	
    /**
     * 获取当前用户ID
     * @return
     */
	protected static String getUserId(HttpServletRequest request){
		String userId="";
		User user = UserUtils.getUser(request);
		if(user!=null)
		userId=user.getUserId().toString()==null?"":user.getUserId().toString(); //员工ID
		return userId;
	}
	/**
	 * 获取用户名字
	 * @param request
	 * @return
	 */
	protected static String getUserName(HttpServletRequest request){
		String userName="";
		User user = UserUtils.getUser(request);
		if(user!=null)
		  userName=user.getUserName()==null?"":user.getUserName(); //员工名字
		return userName;
	}
	
	/**
	 * 获取当前时间 返回String类型
	 * @return
	 */
	protected static String getNowTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date=df.format(new Date());
		return date;
	}
	 /**
	  * 获取当前时间 返回Date类型
	  * @return
	  * @throws ParseException 
	  */
	protected static Date getDate(){
		 Date now = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式 
		 String s = dateFormat.format(now); 
		 Date data;
		try {
			data = dateFormat.parse(s);
			return data;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	 }
	
}
