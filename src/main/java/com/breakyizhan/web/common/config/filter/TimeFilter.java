package com.breakyizhan.web.common.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

//编写TimeFilter，打印日志计算controller执行的耗时。这里我们首先通过@Component注解的形式实现
/**
 * ①通过 @Component的形式实现
 * 首先定义一个Controller对外接口。这个接口的意思是：通过 localhost:8080/user/2 访问资源，id属性必须为数字。在这个接口中通过log4j打印日志，证明请求已经进入controller
 * */
@Component
@Slf4j
public class TimeFilter implements Filter {


  @Override
  public void init(FilterConfig filterConfig) {
    log.info("TimeFilter 初始化");
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    log.info("TimeFilter doFilter开始");
    long start = System.currentTimeMillis();
    filterChain.doFilter(servletRequest, servletResponse);
    log.info("TimeFilter 耗时 : " + (System.currentTimeMillis() - start) + "ms");
    log.info("TimeFilter doFilter结束");
  }

  @Override
  public void destroy() {
    log.info("TimeFilter 销毁");

  }


}