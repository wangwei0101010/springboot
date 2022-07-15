package com.breakyizhan.web.common.base.res;

import com.breakyizhan.web.common.base.ResponseCode;
import java.util.List;
import lombok.Data;

/**
 * BaseResultVO
 *
 * @author zy
 * @date 2021/4/6 16:56
 */
@Data
public class BaseResultVO<T> {

//    @ApiModelProperty("响应码")
    private Integer code;

//    @ApiModelProperty("响应信息")
    private String msg;

    private T data;

    private BaseResultVO() {
        this(ResponseCode.CODE_SUCCESS, null, null);
    }

    private BaseResultVO(T data) {
        this(ResponseCode.CODE_SUCCESS, null, data);
    }

    private BaseResultVO(String msg) {
        this(ResponseCode.CODE_SUCCESS, msg, null);
    }

    private BaseResultVO(int code, String msg) {
        this(code, msg, null);
    }

    private BaseResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> BaseResultVO<T> success() {
        return new BaseResultVO();
    }

    public static <T> BaseResultVO<T> success(String msg, T data) {
        return new BaseResultVO(ResponseCode.CODE_SUCCESS, msg, data);
    }

    public static <T> BaseResultVO<T> success(String msg, List<T> data) {
        return new BaseResultVO(ResponseCode.CODE_SUCCESS, msg, data);
    }

    public static <T> BaseResultVO<T> success(String msg, BasePageResVO<T> data) {
        return new BaseResultVO(ResponseCode.CODE_SUCCESS, msg, data);
    }

    public static <T> BaseResultVO<T> success(T data) {
        return new BaseResultVO(data);
    }

    public static <T> BaseResultVO<T> success(String msg) {
        return new BaseResultVO(msg);
    }

    public static <T> BaseResultVO<T> success(List<T> data) {
        return new BaseResultVO(data);
    }

    public static <T> BaseResultVO<T> success(BasePageResVO<T> data) {
        return new BaseResultVO(data);
    }

    public static <T> BaseResultVO<T> error(int code, String msg) {
        return new BaseResultVO(code, msg, null);
    }
    public static <T> BaseResultVO<T> error(int code, String msg,T data) {
        return new BaseResultVO(code, msg, data);
    }

    public static <T> BaseResultVO<T> error(String msg) {
        return new BaseResultVO(ResponseCode.CODE_USUALLY_ERROR, msg, null);
    }
}
