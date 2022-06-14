package com.breakyizhan.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面
@Component
@Aspect
public class aspact  {

  @Before("execution(* com.breakyizhan.web.Controller.*(..))")
  public void before(){
    System.err.println("前置通知");
  }


  @After("execution(* com.breakyizhan.web.*.*.*(..))")
  public void after(){
    System.err.println("后置通知");
  }

  @Around("execution(* com.breakyizhan.web.*.*.*(..))")
  public void around(ProceedingJoinPoint pjp) throws Throwable {
    System.err.println("环绕前通知");
    Signature signature = pjp.getSignature();//获得签名
    System.err.println("signature:{}"+signature);
    //执行方法
    pjp.proceed();
    System.err.println("环绕后通知");
  }














}
