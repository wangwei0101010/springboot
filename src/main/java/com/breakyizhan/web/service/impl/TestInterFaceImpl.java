/**
 * FileName: UserServiceImpl
 * Author:   Administrator
 * Date:     2020/1/6 15:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.service.impl;

import com.breakyizhan.web.dao.UserDao;
import com.breakyizhan.web.model.UserInfo;
import com.breakyizhan.web.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/1/6
 * @since 1.0.0
 */
@Service
public class TestInterFaceImpl  implements TestInterFace {

    //引入dao层接口
    @Autowired UserDao userDao;
    @Override public int testInterFace() {
        return 0;
    }

    @Override public UserInfo testUser() {
        return new UserInfo();
    }

    //新增的接口实现
    @Override public int insertUser(String username,String password) {
        return userDao.insert(username,password);
    }


}
