package com.microgrid.management.exception;

public class EnergyAssetNotFoundException extends RuntimeException{
    public EnergyAssetNotFoundException(Long id){
        super
                ("Couldn't find an EnergyAsset with id "+id);
    }
}
