//package com.breakyizhan.web.common.config.interceptor;
///**
// *
// * */
//@Component
//public class TimeInterceptor implements HandlerInterceptor {
//
//  private Logger logger = LoggerFactory.getLogger(TimeInterceptor.class);
//
//  @Override
//  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//    request.setAttribute("startTime", System.currentTimeMillis());
//    logger.info("进入TimeInterceptor preHandle");
//    HandlerMethod handlerMethod = (HandlerMethod) handler;
//    System.out.println(handlerMethod.getBean().getClass().getName());
//    System.out.println(handlerMethod.getMethod().getName());
//    return true;
//  }
//
//  @Override
//  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//    logger.info("进入TimeInterceptor postHandle");
//    logger.info("耗时 : " + (System.currentTimeMillis() - (long) request.getAttribute("startTime")));
//  }
//
//  @Override
//  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//    logger.info("进入TimeInterceptor afterCompletion");
//    logger.info("耗时 : " + (System.currentTimeMillis() - (long) request.getAttribute("startTime")));
//  }
//}
