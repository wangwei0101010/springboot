/**
 * FileName: IuserDao
 * Author:   Administrator
 * Date:     2020/1/6 15:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.dao;

import com.breakyizhan.web.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/1/6
 * @since 1.0.0
 */
@Mapper
public interface  UserDao {
    @Select("SELECT * FROM userinfo WHERE username = #{username}")
    UserInfo findByName(@Param("username") String username);

    @Insert("INSERT INTO userinfo(username, password) VALUES(#{username}, #{password})")
    int insert(@Param("username") String name, @Param("password") String password);

}
