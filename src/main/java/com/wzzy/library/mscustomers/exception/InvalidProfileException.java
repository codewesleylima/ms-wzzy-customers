package com.wzzy.library.mscustomers.exception;

import com.wzzy.library.bfflibrary.exception.ValidationException;

public class InvalidProfileException extends ValidationException {
    public InvalidProfileException(String message) {
        super(message, "INVALID_PROFILE");
    }
}
