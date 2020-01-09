package com.breakyizhan.web.common.spring;

import com.breakyizhan.web.common.model.User;
import com.breakyizhan.web.common.redis.UserRedisUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName LoginCheckAop
 * @Description 使用切面拦截所有的查询操作，判断用户是否已经登录

 **/
@Component
@Aspect
@Lazy()
public class LoginCheckAop  {

    private final Logger log = LoggerFactory.getLogger(LoginCheckAop.class);

    public static UserRedisUtils redisTemplate = SpringContextHolder.getBean(UserRedisUtils.class);

    @Pointcut("execution(* com.breakyizhan.web.service.impl.*.*(..))")
    public void controllerMethodPointcut(){}

    /**
     * 判断用户是否已经登录，拦截所有的方法
     */
    @Around("controllerMethodPointcut()")
    public Object  checkLogin(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        User user = redisTemplate.getUser(request);
//        if(user==null){
//            log.info("用户没有登录");
//            return MyResult.error("请登录");
//        }
        return pjp.proceed();
    }
}
