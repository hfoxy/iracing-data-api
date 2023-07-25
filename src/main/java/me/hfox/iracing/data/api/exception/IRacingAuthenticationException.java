package me.hfox.iracing.data.api.exception;

public class IRacingAuthenticationException extends RuntimeException {

    public IRacingAuthenticationException() {
        super();
    }

    public IRacingAuthenticationException(String message) {
        super(message);
    }

    public IRacingAuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IRacingAuthenticationException(Throwable cause) {
        super(cause);
    }

    protected IRacingAuthenticationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
