package com.wfxuni.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class Base64Util {

    // 编码
    public static String encoder(String str) {
        BASE64Encoder encoder = new BASE64Encoder();
        String encodeStr = encoder.encode(str.getBytes());
        return encodeStr;
    }

    // 解码
    public static String decoder(String str) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodeResult = decoder.decodeBuffer(str);
        return new String(decodeResult);
    }

}
