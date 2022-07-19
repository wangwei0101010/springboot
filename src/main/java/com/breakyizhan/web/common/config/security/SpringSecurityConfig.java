package com.breakyizhan.web.common.config.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * spring 认证和授权
 *
 * */
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


  /**
   * 授权
   * */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    //首页全部允许  level1下只允许vip1访问
    http.authorizeRequests().antMatchers("/").permitAll()
        .antMatchers("/level1").hasRole("vip1");
    //没有权限默认到首页
    http.formLogin();
  }

  /**
   * 认证
   * 密码编码 passwordEncoder
   * */
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    super.configure(auth);
    auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
          .withUser("kuangshen").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2");
  }
}
