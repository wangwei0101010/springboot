package com.breakyizhan.web.common.util;

public class CommonValue {

	public static final String RSPCODE = "code";


	public static final String NO_LOGIN = "NO_LOGIN";
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILED = "FAILED";
	public static final String DOMAIN_NAME = "";
	public static final String NO_PERMISSION = "NO_PERMISSION";
	
	//登录session名称
	public static final String USER_LOGIN = "USER_LOGIN";
	
	//保存游客cookie名称
	public static final String COOKIE_GUEST_ = "COOKIE_GUEST_";
	
	
	//全局
	//参数错误
	public static final int PARAM_WRONT = 1001;
	//登录过期
	public static final int NO_LOGIN_CODE = -1000;
	public static final int OTHER_LOGIN_CODE = -1002;
	//无权限
	public static final int NO_PERMISSION_CODE = -1001;
	
	//用户相关
	public static final int USER_NOT_FOUND = 2001;
	public static final int USER_IS_EXPIRED = 2001;

	//redis缓存的key
    public static final String COUNTDATEJSON="Scheduler：countDateJson";
    public static final String COUNTBYPROVINCEJSON="Scheduler：countByProvinceJson";
    public static final String COUNTBYTYPEJSON="Scheduler：countByTypeJson";
    public static final String TOPFIVEDATAJSON="Scheduler：topFiveDataJson";
    public static final String LATESTDATAJSON="Scheduler：latestDataJson";


}