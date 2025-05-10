package com.microgrid.management.exception;

public class TariffPlanNotFoundException extends RuntimeException{
    public TariffPlanNotFoundException(Long id){
        super
                ("Couldn't find a TariffPan with id "+id);
    }
}
