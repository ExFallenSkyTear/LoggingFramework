package com.java.framework.logging;

import java.time.LocalDateTime;

public class LogLine {
    private final LocalDateTime dateTime;

    private final String source;

    private final String message;

    private final LogLevel level;

    LogLine(LogLevel level, LocalDateTime dateTime, String source,String message) {
        this.dateTime = dateTime;
        this.source = source;
        this.message = message;
        this.level = level;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getSource() {
        return source;
    }

    public String getMessage() {
        return message;
    }

    public LogLevel getLevel() {
        return level;
    }
}
