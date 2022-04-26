package com.breakyizhan.web.common.config.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ②通过Configuration配置类的形式
 *
 * 在上边代码的基础上稍作改动，首先去除TimeFilter过滤器的@Component注解
 * 添加配置类 WebConfig。在这个配置类中，我们向Spring容器注入了一个FilterRegistrationBean 的Bean，这里边包含TimeFilter过滤器、指定的过滤路径为/user/下的所有url，对于除此之外的其他URL不做过滤
 * */
@Configuration
public class WebConfig {

  @Bean
  public FilterRegistrationBean timeFilter() {
    FilterRegistrationBean bean = new FilterRegistrationBean();
    bean.setFilter(new TimeFilter());
    bean.addUrlPatterns("/user/*");
    return bean;
  }
}
