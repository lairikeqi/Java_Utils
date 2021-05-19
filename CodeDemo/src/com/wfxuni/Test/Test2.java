package com.wfxuni.Test;

public class Test2 {

    private Byte aByte;
    private Short aShort;
    private Integer aInteger;
    private Long aLong;
    private Float aFloat;
    private Double aDouble;
    private Character aCharacter;
    private Boolean aBoolean;

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.toString());
    }

    @Override
    public String toString() {
        return "Test2{" +
                "aByte=" + aByte +
                ", aShort=" + aShort +
                ", aInteger=" + aInteger +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", aCharacter=" + aCharacter +
                ", aBoolean=" + aBoolean +
                '}';
    }
}
