package com.java.framework.logging;

public enum LogLevel {
    Critical(0, "Critical"),
    Error(1, "Error"),
    Warning(2, "Warning"),
    Info(3, "Info"),
    Debug(4, "D3bug");

    LogLevel(int value, String label) {
        this.value = value;
        this.label = label;
    }

    private final int value;

    private final String label;

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return Integer.toString(value);
    }
}