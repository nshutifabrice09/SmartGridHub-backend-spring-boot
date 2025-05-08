package com.microgrid.management.exception;

public class BillingRecordNotFoundException extends RuntimeException{
    public BillingRecordNotFoundException(Long id){
        super
                ("Couldn't find a BillingRecord with id "+id);
    }
}
