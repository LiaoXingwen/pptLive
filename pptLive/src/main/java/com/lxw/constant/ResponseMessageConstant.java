package com.lxw.constant;

import com.lxw.domain.ResponseMessage;

/**
 * Created by lxw on 2017/7/25.
 */
public class ResponseMessageConstant {

    //成功：1000-2000
    public static final String  SUCCESS = new ResponseMessage(1000,"操作成功").toString();
    //提示类：2000-3000
    //失败：3000-4000
    public static final Integer FAILCODE = 3000 ;
}
