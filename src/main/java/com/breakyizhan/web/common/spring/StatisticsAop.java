package com.breakyizhan.web.common.spring;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 *<p>Title:StatisticsAop</p>
 *<p>Description:通过切面进行数据统计</p>

 */
@Aspect
@Component
public class StatisticsAop {

//   public static UserRedisUtils redisTemplate = SpringContextHolder.getBean(UserRedisUtils.class);


   @Before("execution(* com.breakyizhan.web.service.impl.*.addRecord(..))")
   public  void  dataCount(JoinPoint pjp) throws Throwable{
//		Signature signature = pjp.getSignature();
//		MethodSignature methodSignature = (MethodSignature)signature;
//		Method targetMethod = methodSignature.getMethod();
//		Method realMethod = pjp.getTarget().getClass().getDeclaredMethod(signature.getName(), targetMethod.getParameterTypes());
//		    //首先判断方法级别
//		    ModelDescription cds=realMethod.getAnnotation(ModelDescription.class);
//	    	if(cds==null){ //判断类级别
//	    		 cds= AnnotationUtils.findAnnotation(realMethod.getDeclaringClass(), ModelDescription.class);
//	    	}
//	    	if(cds==null){
//	    		return;
//	    	}
//	    	String modelDescription=cds.value();
//	    	String skey="statistics:"+cds.key();
//	        //加入总数
//	        redisTemplate.putHash(skey, "name", modelDescription);
//	    	redisTemplate.putHash(skey, "key", cds.key());
//	        redisTemplate.incrHash(skey,"count", 1);
//	        redisTemplate.incrHash(skey,"todayCount", 1);
   }

}
