/**
 * FileName: User
 * Author:   Administrator
 * Date:     2020/1/6 15:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.model;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/1/6
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private long id;
    private String username;
    private String password;
    private String token;


}
