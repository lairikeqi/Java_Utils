package com.wfxuni.Test;

public class Test1 {

    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private char aChar;
    private boolean aBoolean;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.toString());
    }

    @Override
    public String toString() {
        return "Test1{" +
                "aByte=" + aByte +
                ", aShort=" + aShort +
                ", anInt=" + anInt +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", aChar=" + aChar +
                ", aBoolean=" + aBoolean +
                '}';
    }
}
