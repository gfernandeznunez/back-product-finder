package com.walmart.search.util;

public enum ExceptionMessagesEnum {
    PARAM_NOT_FOUND("Incomplete search option");

    ExceptionMessagesEnum(String msg) {
        value = msg;
    }

    private final String value;

    public String getValue(){
        return value;
    }
}
