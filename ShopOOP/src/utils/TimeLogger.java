package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLogger implements Logger{
    private DateTimeFormatter formatter;
    public TimeLogger() {
        this.formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    @Override
    public void log() {
        LocalDateTime dateTime = LocalDateTime.now();
        String time = this.formatter.format(dateTime.toLocalTime());
        System.out.println(time + ": ");
    }

}
