package aop04;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 10:45
 * Description:
 * version:1.0
 */
public class SomeException extends Exception {
    public SomeException() {
    }

    public SomeException(String message) {
        super(message);
    }

    public SomeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomeException(Throwable cause) {
        super(cause);
    }

    public SomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
