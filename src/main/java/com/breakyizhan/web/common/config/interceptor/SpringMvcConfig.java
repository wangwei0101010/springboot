package com.breakyizhan.web.common.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>Description:配置springMVC拦截器</p>
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {


  //让spring管理,才能使用@Autowired
  @Bean
  public CommonInterceptor getCommonInterceptor() {
    return new CommonInterceptor();
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    //addPathPatterns拦截的路径
    String[] addPathPatterns = {
        "/**"
    };
    //excludePathPatterns排除的路径
    String[] excludePathPatterns = {
       // "/user/login", "/user/noLg", "/user/error", "/userAuth/orgAuthLink",
         "/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**", "/notify/**",
        "/test", "/web/approve/callBack*"
    };

    InterceptorRegistration registration = registry
        .addInterceptor(getCommonInterceptor());//  //让spring管理,CommonInterceptor里面才能使用@Autowired
  //  registration.addPathPatterns(addPathPatterns);
  //  registration.excludePathPatterns(excludePathPatterns);
  }


  //添加资源位置,解决css 404报错
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/templates/");
    registry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
  }
}
