package com.itany.nmms.ecxeption;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/23 11:07
 * Description:
 * version:1.0
 */
public class StaffNotExistException extends Exception {
    public StaffNotExistException() {
    }

    public StaffNotExistException(String message) {
        super(message);
    }

    public StaffNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public StaffNotExistException(Throwable cause) {
        super(cause);
    }

    public StaffNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
