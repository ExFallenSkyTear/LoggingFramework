package com.java.framework.logging;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class LoggingManager {
    private ArrayList<LogLine> logLines = new ArrayList<>();

    private LogLevel level = LogLevel.Info;

    public void Critical(String source, String message) {
        newLog(LogLevel.Critical, source, message);
    }

    public void Error(String source, String message) {
        newLog(LogLevel.Error, source, message);
    }

    public void Warning(String source, String message) {
        newLog(LogLevel.Warning, source, message);
    }

    public void Info(String source, String message) {
        newLog(LogLevel.Info, source, message);
    }

    public void Debug(String source, String message) {
        newLog(LogLevel.Debug, source, message);
    }

    private void newLog(LogLevel level, String source, String message) {
        if (isLevelValid(level)) {
            LogLine localLine = new LogLine(level, LocalDateTime.now(), source, message);
            logLines.add(localLine);
        }
    }

    private boolean isLevelValid(LogLevel messageLevel) {
        return this.level.getValue() >= messageLevel.getValue();
    }

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public int getLinesCount() {
        return logLines.size();
    }

    public LogLine getLine(int index) {
        return logLines.get(index);
    }
}
