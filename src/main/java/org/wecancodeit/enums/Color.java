package org.wecancodeit.enums;

public enum Color {

    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet"),
    OFF_WHITE("Off White"),
    IVORY("Ivory"),
    EBONY("Ebony"),
    BLACK("Black"),
    CHROME("Chrome"),
    PINK("Pink");

    String colorName;
    Color(String colorName){
        this.colorName = colorName;
    }
    public String toString(){
        return colorName;
    }
}