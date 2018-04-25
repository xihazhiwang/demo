package com.example.demo;

public enum DBExceptionEnums implements ExceptionEnums {

    SYTEM_ERROR(10001, "系统错误，请联系管理员");

    private int code;
    private String msg;

    DBExceptionEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
