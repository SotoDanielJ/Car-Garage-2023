package org.wecancodeit.enums;

public enum FuelType {
    
    GAS("Gas"),
    ELECTRIC("Electric");

    String fuelName;
    FuelType(String fuelName){
        this.fuelName = fuelName;
    }
    public String toString(){
        return fuelName;
    }
}