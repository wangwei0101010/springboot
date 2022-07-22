package com.breakyizhan.web.Controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //不是restController!!!!!,返回的是视图
@RequestMapping("/springBoot")
@Slf4j
public class SpringBootThymeleafController {


  @RequestMapping("/index")
  public String index() {
    return "index";
  }


  @RequestMapping("/login")
  public String login(@RequestParam("username") String username, @RequestParam("password") String password,Model model) {
    log.info("username{}",username);
    log.info("password{}",password);
    return "dashboard";
  }

}
