package me.hfox.iracing.data.api.exception;

import me.hfox.iracing.data.api.data.base.ErrorResponse;

import java.util.Objects;

public class IRacingRequestDataException extends RuntimeException {

    private final ErrorResponse body;

    public IRacingRequestDataException(ErrorResponse body) {
        super(Objects.requireNonNullElse(body.getError(), "unknown") + ": " + Objects.requireNonNullElse(body.getMessage(), "unknown"));
        this.body = body;
    }

}
