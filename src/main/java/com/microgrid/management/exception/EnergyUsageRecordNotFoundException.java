package com.microgrid.management.exception;

public class EnergyUsageRecordNotFoundException extends RuntimeException{
    public EnergyUsageRecordNotFoundException(Long id){
        super
                ("Couldn't find an EnergyUsageRecord with id "+id);
    }
}
