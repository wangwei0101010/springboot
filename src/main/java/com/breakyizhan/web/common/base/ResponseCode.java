package com.breakyizhan.web.common.base;

/**
 * ResponseCode
 * 响应code
 *
 * @author ZhengYu
 * @date 2020/4/14 11:34
 */
public class ResponseCode {

    /**
     * 成功响应码
     */
    public static final int CODE_SUCCESS = 0;

    /**
     * 通用异常响应码
     */
    public static final int CODE_USUALLY_ERROR = 1;

    /**
     * 超时异常码
     */
    public static final int CODE_RETRY = 502;

    /**
     * 登录失效异常码
     */
    public static final int CODE_INVALID = 2;

    public static final String LOGIN_TOKEN_PRE = "auth:user:token:";

    public static final String AUTH_CLIENT_TOKEN = "auth:client:token";

    public static final String AUTH_USER_LINK="auth:user:link:";

    public static final String AUTH_ORG_LINK="auth:org:link:";
}
