package com.java.framework.logging;

public enum LogLevel {
    Critical(0),
    Error(1),
    Warning(2),
    Info(3),
    Debug(4);

    LogLevel(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}