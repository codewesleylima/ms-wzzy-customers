package com.wzzy.library.mscustomers.exception;

import com.wzzy.library.bfflibrary.exception.ResourceNotFoundException;

public class CustomerNotFoundException extends ResourceNotFoundException {
    public CustomerNotFoundException(String identifier) {
        super("Customer", identifier);
    }
}
