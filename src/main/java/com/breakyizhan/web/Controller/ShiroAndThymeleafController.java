package com.breakyizhan.web.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //不是restController!!!!!,返回的是视图
public class ShiroAndThymeleafController {


  @RequestMapping("/index")
  public String toIndex(Model model) {
    System.out.println("123");
    model.addAttribute("msg", "hello,Shiro");
    return "index";
  }

  @RequestMapping("/user/add")
  public String toAdd() {
    return "user/add";
  }

  @RequestMapping("/user/update")
  public String toUpdate() {
    return "user/update";
  }

  @RequestMapping("/toLogin")
  public String toLogin() {
    return "login";
  }



  @RequestMapping(value = "/login")
  public String login(String username,String password,Model model){
    System.out.println("login");
    ////使用shiro，编写认证操作
    //获取当前用户
    Subject subject = SecurityUtils.getSubject();
    //封装用户的登录数据
    UsernamePasswordToken token = new UsernamePasswordToken(username, password);

    try {
      subject.login(token);//执行登录的方法,如果没有异常就是正常
      return "index";
    }catch (UnknownAccountException e){
      model.addAttribute("msg","用户名错误");
      return "login";
    }catch (IncorrectCredentialsException e){
      model.addAttribute("msg","密码错误");
      return "login";
    }
  }

  @RequestMapping("/noauth")
  @ResponseBody
  public String unauthorized() {
    return "未经授权无法访问";
  }



}
