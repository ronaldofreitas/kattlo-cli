package com.github.kattlo.core.exception;

/**
 * @author fabiojose
 */
public class LoadException extends RuntimeException {
    private static final long serialVersionUID = 8989901846495856854L;

    public LoadException() {
    }

    public LoadException(final Throwable cause) {
        super(cause);
    }

    public LoadException(final String message) {
        super(message);
    }

    public LoadException(final String message, final Throwable cause){
        super(message, cause);
    }
}
