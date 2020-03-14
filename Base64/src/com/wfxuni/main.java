package com.wfxuni;

import com.wfxuni.utils.Base64Util;

import java.util.function.Consumer;

public class main {

    private static Consumer consumer = System.out::println;

    public static void main(String[] args) {
        String string = "想太多会难过";
        String encodeResult = Base64Util.encoder(string);
        consumer.accept(encodeResult);
        try {
            consumer.accept(Base64Util.decoder(encodeResult));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
