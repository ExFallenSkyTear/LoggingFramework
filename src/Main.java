import com.java.framework.logging.LogLevel;
import com.java.framework.logging.LogLine;
import com.java.framework.logging.LoggingManager;

import java.time.format.DateTimeFormatter;

public class Main {
    static LoggingManager globalLogger = new LoggingManager();

    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

    public static void main(String[] args) {
        globalLogger.setLevel(LogLevel.Debug);
        globalLogger.Debug(new Exception().getStackTrace()[0].getMethodName(), "The response code is 24.");

        LogLine testLine = globalLogger.getLine(globalLogger.getLinesCount() - 1);

        System.out.printf("[%s][%s](%s): %s%n",
                testLine.getDateTime().format(myFormatObj),
                testLine.getLevel().getLabel(),
                testLine.getSource(),
                testLine.getMessage());
    }
}