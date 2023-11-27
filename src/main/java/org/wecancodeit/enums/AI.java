package org.wecancodeit.enums;

public enum AI {

    HK47("HK47"),
    C3PO("C3PO"),
    R2D2("R2D2"),
    R5D4("R5D4"),
    AP5("AP5"),
    BD1("BD1"),
    IG11("IG11"),
    EV9D9("EV9D9"),
    BB8("BB8"),
    L337("L337"),
    K2SO("K2SO"),
    None("None");

    String aiName;
    AI(String aiName){
        this.aiName = aiName;
    }
    public String toString(){
        return aiName;
    }
}