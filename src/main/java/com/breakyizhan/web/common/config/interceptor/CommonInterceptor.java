package com.breakyizhan.web.common.config.interceptor;


import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.breakyizhan.web.common.redis.UserRedisUtils;
import com.google.protobuf.ServiceException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//import com.gcx.api.common.model.User;
//import com.gcx.api.common.util.UserUtils;

/**
 * <p>Title:CommonInterceptor</p>
 * <p>Description:统一登陆拦截</p>
 */
public class CommonInterceptor implements HandlerInterceptor {

  private final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);
  @Autowired
  private UserRedisUtils userRedisUtils;

  /**
   * 在业务处理器处理请求之前被调用 如果返回false 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链 如果返回true
   * 执行下一个拦截器,直到所有的拦截器都执行完毕 再执行被拦截的Controller 然后进入拦截器链, 从最后一个拦截器往回执行所有的postHandle()
   * 接着再从最后一个拦截器往回执行所有的afterCompletion()
   */
  @Override
  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {

    System.out.println("》》》》》》》》》》》》》》》》》测试拦截器");

    String token = request.getHeader("token");//前端请求头中传过来的token信息
    // 如果不是映射到方法直接通过
   /* if (!(handler instanceof HandlerMethod)) {
      return true;
    } else {
      HandlerMethod h = (HandlerMethod) handler;
      AuthAccess authAccess = h.getMethodAnnotation(AuthAccess.class);
      if (authAccess != null) {
        return true;
      }
    }
    // 执行认证
    if (StrUtil.isBlank(token)) {
      throw new ServiceException(Constants.CODE_401, "无token，请重新登录");
    }
    // 获取 token 中的 user id
    String userId;
    try {
      userId = JWT.decode(token).getAudience().get(0);
    } catch (JWTDecodeException j) {
      throw new ServiceException(Constants.CODE_401, "token验证失败，请重新登录");
    }
    // 根据token中的userid查询数据库
    User user = userService.getById(userId);
    if (user == null) {
      throw new ServiceException(Constants.CODE_401, "用户不存在，请重新登录");
    }

    // 用户密码加签验证 token
    JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
    try {
      jwtVerifier.verify(token); // 验证token
    } catch (JWTVerificationException e) {
      throw new ServiceException(Constants.CODE_401, "token验证失败，请重新登录");
    }*/

    return true;


  }

  //@Autowired
//	UserInfoService userService;

  /**
   * 配合jwt使用
   */
/*	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
		String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
		// 如果不是映射到方法直接通过
		if(!(object instanceof HandlerMethod)){
			return true;
		}
		HandlerMethod handlerMethod=(HandlerMethod)object;
		Method method=handlerMethod.getMethod();
		//检查是否有passtoken注释，有则跳过认证
		if (method.isAnnotationPresent(PassToken.class)) {
			PassToken passToken = method.getAnnotation(PassToken.class);
			if (passToken.required()) {
				return true;
			}
		}
		//检查有没有需要用户权限的注解
		if (method.isAnnotationPresent(UserLoginToken.class)) {
			UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
			if (userLoginToken.required()) {
				// 执行认证
				if (token == null) {
					throw new RuntimeException("无token，请重新登录");
				}
				// 获取 token 中的 user id
				String userId;
				try {
					userId = JWT.decode(token).getAudience().get(0);
				} catch (JWTDecodeException j) {
					throw new RuntimeException("401");
				}
			//	User user = userService.findUserById(userId);
		*//*		if (user == null) {
					throw new RuntimeException("用户不存在，请重新登录");
				}*//*
				// 验证 token
		*//*		JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
				try {
					jwtVerifier.verify(token);
				} catch (JWTVerificationException e) {
					throw new RuntimeException("401");
				}*//*
				return true;
			}
		}
		return true;
	}*/
  @Override
  public void postHandle(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse,
      Object o, ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse,
      Object o, Exception e) throws Exception {
  }


}
