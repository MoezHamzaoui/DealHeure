package com.dh.model;

public class ByteConvertor {
    public static String compute(int bytesQuantity){
        int kib = 1024;
        int mib = kib * kib;
        if(bytesQuantity<kib){
            return String.valueOf(bytesQuantity);
        } else if(bytesQuantity<mib){
           return bytesQuantity/kib+" KIB";
        } else {
            return bytesQuantity / mib + " KIB";
        }
    }
}
