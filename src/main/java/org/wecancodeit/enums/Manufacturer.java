package org.wecancodeit.enums;

public enum Manufacturer {
    
    GM("GM"),
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    DODGE("Dodge"),
    HONDA("Honda"),
    NISSAN("Nissan"),
    TESLA("Tesla"),
    BMW("BMW"),
    RIVIAN("Rivian"),
    LAMBORGHINI("Lamborghini");

    String makeName;
    Manufacturer(String makeName){
        this.makeName = makeName;
    }
    public String toString(){
        return makeName;
    }
}