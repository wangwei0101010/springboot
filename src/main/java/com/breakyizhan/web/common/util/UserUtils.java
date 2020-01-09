package com.breakyizhan.web.common.util;

import com.breakyizhan.web.common.model.User;
import com.breakyizhan.web.common.redis.UserRedisUtils;
import com.breakyizhan.web.common.spring.SpringContextHolder;

import javax.servlet.http.HttpServletRequest;

/**
 *<p>Title:UserUtils</p>
 *<p>Description:用户工具类</p>

 */
public class UserUtils {
//	private static CacheUtil cacheUtil = SpringContextHolder.getBean(CacheUtil.class);
	private static UserRedisUtils cacheUtil = SpringContextHolder.getBean(UserRedisUtils.class);
	public static User getUser(HttpServletRequest request){
//		  User user=null;
//		  String gcxId="";
//		  Cookie[] cookie=request.getCookies();
//		  if(cookie!=null){
//			  for (Cookie cookie2 : cookie) {
//				  if(cookie2.getName().equals("GCXID"))
//					  gcxId=cookie2.getValue();
//			  }
//		  }
		User user = cacheUtil.getUser(request);
		return user;
	}
}
