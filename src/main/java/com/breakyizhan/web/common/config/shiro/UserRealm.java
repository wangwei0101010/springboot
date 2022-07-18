package com.breakyizhan.web.common.config.shiro;

import com.breakyizhan.web.common.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

//自定义userRealm
@Slf4j
public class UserRealm extends AuthorizingRealm {

  //授权
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    log.info("授权======>接口调用");
    SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
    //拿到当前登录的这个对象
    Subject subject = SecurityUtils.getSubject();
    //拿到user对象
    User currentUser = (User)subject.getPrincipal();
    //设置当前用户权限,要从数据库中获取,这里写死了
    info.addStringPermission("user:add");
    return info;
  }

  //认证
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
      throws AuthenticationException {
    log.info("认证======>接口调用");

    User user = new User();
    //假设数据库的用户名和密码
    String name = "root";
    String password = "123456";
    //1.判断用户名
    UsernamePasswordToken userToken = (UsernamePasswordToken) token;
    if (!userToken.getUsername().equals(name)) {
      //用户名不存在
      return null; //shiro底层就会抛出 UnknownAccountException
    }
    //2. 验证密码,我们可以使用一个AuthenticationInfo实现类 SimpleAuthenticationInfo
    // shiro会自动帮我们验证！重点是第二个参数就是要验证的密码！
    //参数1:保存user对象信息,在授权页面获取user对象
    return new SimpleAuthenticationInfo(user, password, "");
  }


}
