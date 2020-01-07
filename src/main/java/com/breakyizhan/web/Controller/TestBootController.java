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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        return testInterFace.testaUser();
    }

/*
    @ComponentScan(basePackages = {"com.breakyizhan.web.service"})//添加的注解 解決自动注入问题
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestBootController.class, args);
    }
*/


}
