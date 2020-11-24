package com.walmart.search.util;

public class DataType {
    public static boolean isInteger(String value){
        if (value == null) {
            return false;
        }
        try {
            Integer number = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
