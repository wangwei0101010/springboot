package com.breakyizhan.web.common.validator;


import com.breakyizhan.web.common.exception.ParameterException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *<p>Title:ValidatorUtils</p>
 *<p>Description:Validator校验</p>

 */
public class ValidatorUtils extends Assert{
    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 校验对象
     * @param object        待校验对象
     * @param groups        待校验的组
     * @throws ParameterException  校验不通过，则报ParameterException异常
     */
    public static void validateEntity(Object object, Class<?>... groups){
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
        if (!constraintViolations.isEmpty()) {
        	Map<String,Object> map=new HashMap<String, Object>();
            for (ConstraintViolation<?> item : constraintViolations) {
                /**验证不通过的信息*/
                map.put(item.getPropertyPath().toString(), item.getMessage());
            } 
        	  throw new ParameterException(map.toString());
        }
    }
}
