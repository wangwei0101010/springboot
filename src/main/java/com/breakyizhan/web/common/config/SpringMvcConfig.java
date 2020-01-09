package com.breakyizhan.web.common.config;

import com.breakyizhan.web.common.spring.CommonInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *<p>Description:配置springMVC拦截器</p>
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	registry.addInterceptor(new CommonInterceptor());
    }
}
