/**
 * FileName: IUserService
 * Author:   Administrator
 * Date:     2020/1/6 15:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.service;


import com.breakyizhan.web.model.UserInfo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/1/6
 * @since 1.0.0
 */
public interface TestInterFace {

    public int testInterFace();

    public UserInfo testUser();

    public int insertUser(String username,String password);//新增的接口

}
