package exception;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 16:17
 * Description:
 * version:1.0
 */
public class UserNotExistException extends Exception {
    public UserNotExistException() {
    }

    public UserNotExistException(String message) {
        super(message);
    }

    public UserNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotExistException(Throwable cause) {
        super(cause);
    }

    public UserNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
