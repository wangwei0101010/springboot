/**
 * FileName: springMvcController
 * Author:   Administrator
 * Date:     2020/4/26 15:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/4/26
 * @since 1.0.0
 */
@Controller
@RequestMapping("/springMvc")
public class springMvcController {

    @GetMapping("annotation")
    @ResponseBody
    public Map<String,Object> requestParam(
           @RequestPart("int_val") Integer intVal,
           @RequestPart("long_val") Long longVal,
           @RequestParam(value = "str_val " , required = false) String strval
    ){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("intVal",intVal);
        paramMap.put("longVal",longVal);
        paramMap.put("strval",strval);
        return paramMap;
    }


}
