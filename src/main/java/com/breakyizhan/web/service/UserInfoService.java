package com.breakyizhan.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.breakyizhan.web.model.UserInfo;

public interface UserInfoService extends IService<UserInfo> {


   UserInfo login(UserInfo userInfo) throws Exception;
}
