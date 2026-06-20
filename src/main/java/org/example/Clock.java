package org.example;
import java.time.LocalTime;

public class Clock {

    private LocalTime time;

    public Clock(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Time: " + time;
    }
}