package com.microgrid.management.exception;

public class EnergyTransactionNotFoundException extends RuntimeException{
    public EnergyTransactionNotFoundException(Long id){
        super
                ("Couldn't find an EnergyTransaction with id" +id);
    }
}
