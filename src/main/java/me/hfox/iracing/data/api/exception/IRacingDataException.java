package me.hfox.iracing.data.api.exception;

public class IRacingDataException extends RuntimeException {

    public IRacingDataException() {
        super();
    }

    public IRacingDataException(String message) {
        super(message);
    }

    public IRacingDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public IRacingDataException(Throwable cause) {
        super(cause);
    }

    protected IRacingDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
