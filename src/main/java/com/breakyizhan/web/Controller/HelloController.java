/**
 * FileName: HelloController
 * Author:   Administrator
 * Date:     2019/12/25 16:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/12/25
 * @since 1.0.0
 */

@Configuration  //相当于xml文件的beans配置, 方法可以@bean
public class HelloController {
    public HelloController() {
        System.out.println("Hellocontroller.java文件容器启动初始化。。。");
    }

    //dev
}