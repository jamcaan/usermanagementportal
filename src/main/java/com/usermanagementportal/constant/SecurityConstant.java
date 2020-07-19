package com.usermanagementportal.constant;

public class SecurityConstant {
    // 5 days expiration time in millisecond
    public static final long EXPIRATION_TIME = 432_000_000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String SAGAL_SOFT_INC = "SagalSoft Inc";
    public static final String SAGAL_SOFT_ADMINSTRATION = "User Management Application";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE ="You need to login to access this page";
    public static final String ACCESS_DENIED_MESSAGE ="You don't have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/image/**"};
//public static final String[] PUBLIC_URLS = {"**"};

}
