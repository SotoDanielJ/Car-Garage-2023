package org.wecancodeit.enums;

public enum BodyType {

    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    PICKUP("Pickup"),
    SUV("SUV"),
    SPORTS("Sports"),
    CONVERTIBLE("Convertible");

    String bodyName;
    BodyType(String bodyName){
        this.bodyName = bodyName;
    }
    public String toString(){
        return bodyName;
    }
}
