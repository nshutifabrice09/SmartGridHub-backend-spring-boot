package com.microgrid.management.exception;

public class AlertNotFoundException extends RuntimeException{
    public AlertNotFoundException(Long id){
        super
                ("Couldn't find an Alert with id "+id);
    }
}
