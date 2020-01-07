/**
 * FileName: UserController
 * Author:   Administrator
 * Date:     2020/1/6 15:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.Controller;

import com.breakyizhan.web.model.User;
import com.breakyizhan.web.service.TestInterFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020/1/6
 * @since 1.0.0
 */
@Controller
@RequestMapping("test")
public class TestBootController {
    /**
     * 要求：
     * - 日志按天记录，自动生成当天的记录文件
     * - 日志分级存储（info,error）
     * */
    //增加日志
    private final Logger log = LoggerFactory.getLogger(TestBootController.class);

    @Autowired
    private TestInterFace testInterFace;


    @RequestMapping("/num")
    @ResponseBody
    int home() {
        int i = testInterFace.testInterFace();
        return i;
    }

    @RequestMapping("/get")
    @ResponseBody
    User getUser() {
        //打印日志
        log.info("TestBootController getUser info");
        return testInterFace.testaUser();
    }



}
