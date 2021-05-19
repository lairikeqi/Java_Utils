package com.wfxuni.base;

public class BaseTypeClass {

    private byte aByte;
    private Byte bByte;

    private short aShort;
    private Short bShort;

    private int anInt;
    private Integer bInteger;

    private long aLong;
    private Long bLong;

    private float aFloat;
    private Float bFloat;

    private double aDouble;
    private Double bDouble;

    private char aChar;
    private Character bCharacter;

    private boolean aBoolean;
    private Boolean bBoolean;

    public static void main(String[] args) {
        BaseTypeClass baseTypeClass = new BaseTypeClass();
        System.out.println("byte默认值: " + baseTypeClass.aByte);
        System.out.println("Byte默认值: " + baseTypeClass.bByte);
        System.out.println("short默认值: " + baseTypeClass.aShort);
        System.out.println("Short默认值: " + baseTypeClass.bShort);
        System.out.println("int默认值: " + baseTypeClass.anInt);
        System.out.println("Integer默认值: " + baseTypeClass.bInteger);
        System.out.println("long默认值: " + baseTypeClass.aLong);
        System.out.println("Long默认值: " + baseTypeClass.bLong);
        System.out.println("float默认值: " + baseTypeClass.aFloat);
        System.out.println("Float默认值: " + baseTypeClass.bFloat);
        System.out.println("double默认值: " + baseTypeClass.aDouble);
        System.out.println("Double默认值: " + baseTypeClass.bDouble);
        System.out.println("char默认值: " + baseTypeClass.aChar);
        System.out.println("Character默认值: " + baseTypeClass.bCharacter);
        System.out.println("boolean默认值: " + baseTypeClass.aBoolean);
        System.out.println("Boolean默认值: " + baseTypeClass.bBoolean);
    }
}
