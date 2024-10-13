package com.flipfit.bean;

import java.time.LocalDate;
import java.util.UUID;

public class FlipFitSchedule {
    private String scheduleId;
    private String slotId;
    private int availability;
    private LocalDate date;


    public FlipFitSchedule(LocalDate date, String slotId, int availability) {
        this.scheduleId = UUID.randomUUID().toString();
        this.date = date;
        this.slotId = slotId;
        this.availability = availability;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public String getSlotId() {
        return slotId;
    }

    public int getAvailability() {
        return availability;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
