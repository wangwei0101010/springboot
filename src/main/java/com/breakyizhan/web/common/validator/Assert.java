package com.breakyizhan.web.common.validator;

import com.breakyizhan.web.common.exception.ParameterException;
import com.breakyizhan.web.common.util.StringUtils;


/**
 *<p>Title:Assert</p>
 *<p>Description:数据校验</p>

 */
public abstract class Assert {

    public static void isBlank(String str, String message){
        if (StringUtils.isEmpty(str)) {
            throw new ParameterException(message);
        }
    }

    public static void isNull(Object object, String message){
        if (object == null) {
            throw new ParameterException(message);
        }
    }
}
