package com.mmall.common;

import org.springframework.scheduling.support.SimpleTriggerContext;

/**
 * Created by root on 18-12-13.
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";
    public static final String USERNAME = "username";
    public static final String EMAILL = "emaill";

    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1; //管理员
    }
}