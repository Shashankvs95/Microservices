package com.lcwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Resource not found exception");
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }
}
