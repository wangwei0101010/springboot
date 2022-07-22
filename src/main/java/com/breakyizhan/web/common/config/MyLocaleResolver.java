package com.breakyizhan.web.common.config;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;

/**
 * 国际化
 */
//可以在链接上携带区域信息
public class MyLocaleResolver implements LocaleResolver {

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    String language = request.getParameter("l");
    Locale locale = Locale.getDefault(); // 如果没有获取到就使用系统默认的
    //如果请求链接不为空
    if (!StringUtils.isEmpty(language)) {
      //分割请求参数
      String[] split = language.split("_");
      //国家，地区
      locale = new Locale(split[0], split[1]);
    }
    return locale;
  }

  @Override
  public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

  }


}
