/**
 * FileName: UserController
 * Author:   Administrator
 * Date:     2020/1/7 15:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.Controller;

import com.breakyizhan.web.model.User;
import com.breakyizhan.web.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/1/7
 * @since 1.0.0
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private TestInterFace testInterFace;

    @RequestMapping("get")
    @ResponseBody
    User getUser() {
        return testInterFace.testaUser();
    }

}
