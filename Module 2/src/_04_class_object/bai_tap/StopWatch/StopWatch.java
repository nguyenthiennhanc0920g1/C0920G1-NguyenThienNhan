package _04_class_object.bai_tap.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalTime start() {
        setStartTime(java.time.LocalTime.now());
        return this.startTime;
    }

    public LocalTime stop() {
        setEndTime(java.time.LocalTime.now());
        return this.endTime;
    }

    public long getElapsedTime() {
        return (this.endTime.toNanoOfDay() - this.startTime.toNanoOfDay()) / 1000000;
    }
}
