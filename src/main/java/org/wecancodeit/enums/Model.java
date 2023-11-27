package org.wecancodeit.enums;

public enum Model {

    Passat("Passat"),
    Velar("Velar"),
    Insignia("Insignia"),
    Megane("Megane"),
    Niro("Niro"),
    Kalos("Kalos"),
    Wrangler("Wrangler"),
    MKZ("MKZ"),
    Equinox("Equinox"),
    Sienna("Sienna"),
    TLX("TLX"),
    A4("A4"),
    Series5(""),
    i3("i3"),
    Sonata("Sonata");

    String modelName;
    Model(String modelName){
        this.modelName = modelName;
    }
    public String toString(){
        return modelName;
    }
}