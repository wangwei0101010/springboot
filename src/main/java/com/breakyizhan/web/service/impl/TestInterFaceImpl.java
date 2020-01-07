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

import com.breakyizhan.web.dao.IUserDao;
import com.breakyizhan.web.model.User;
import com.breakyizhan.web.service.TestInterFace;
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

    @Override
    public int testInterFace() {
        return 0;
    }

    @Override
    public User testaUser() {
        return new User();
    }



}
