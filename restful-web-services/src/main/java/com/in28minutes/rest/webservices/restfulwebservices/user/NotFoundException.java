package com.in28minutes.rest.webservices.restfulwebservices.user;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
