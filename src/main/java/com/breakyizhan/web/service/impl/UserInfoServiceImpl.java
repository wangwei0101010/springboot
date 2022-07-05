package com.breakyizhan.web.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breakyizhan.web.common.util.TokenUtils;
import com.breakyizhan.web.dao.UserInfoMapper;
import com.breakyizhan.web.model.UserInfo;
import com.breakyizhan.web.service.UserInfoService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * </p>
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements
    UserInfoService {


  @Override
  public UserInfo login(UserInfo userInfo) throws Exception {
    UserInfo one = this.getById(userInfo.getId());
    if (one != null) {

      String token = TokenUtils.getToken(one.getId() + "", userInfo.getPassword());
      one.setToken(token);
      return one;
    } else {
      throw new Exception("用户名或密码错误");
    }


  }
}
