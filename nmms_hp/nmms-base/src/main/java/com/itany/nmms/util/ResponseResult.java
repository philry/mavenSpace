package com.itany.nmms.util;

import java.io.Serializable;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/10/31 15:26
 * Description:
 * version:1.0
 */
public class ResponseResult implements Serializable {

    //响应状态码
    private String responseCode;
    //响应信息
    private String message;
    //返回值
    private Object returnObject;

    public ResponseResult() {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(Object returnObject) {
        this.returnObject = returnObject;
    }
}
