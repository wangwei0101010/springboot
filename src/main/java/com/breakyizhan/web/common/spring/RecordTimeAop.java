package com.breakyizhan.web.common.spring;

import com.breakyizhan.web.common.util.MyResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @ClassName RecordTimeAop
 * @Description 记录每一个查询的方法的时间
 **/
@Component
@Aspect
public class RecordTimeAop {

    private final Logger log = LoggerFactory.getLogger(RecordTimeAop.class);

    @Pointcut("execution(* com.breakyizhan.web.service.impl..*.find*(..))")
    public void recordTimeAopPointcut(){}

    /**
     * 记录每一个查询的方法的执行时间
     */
    @Around("recordTimeAopPointcut()")
    public Object  checkLogin(ProceedingJoinPoint pjp) throws Throwable {
        MyResult myResult= null;
        long startTime = System.currentTimeMillis();
        Object obj =pjp.proceed();
        long endTime = System.currentTimeMillis();
        if(obj instanceof MyResult){
            myResult=(MyResult)obj;
            long diffTime = endTime - startTime;
            log.info("执行方法耗时"+diffTime);
            myResult.setTime(diffTime);
        }else{
            log.info("返回值不匹配");
        }
        return myResult;
    }



}
