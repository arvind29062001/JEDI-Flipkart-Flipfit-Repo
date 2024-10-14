package com.flipfit.bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class FlipFitSchedule {
    private String scheduleId;
    private String slotId;
    private int availability;
    private Date date;


    public FlipFitSchedule(Date date, String slotId, int availability) {
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

    public Date getDate() {
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

    public void setDate(Date date) {
        this.date = date;
    }

}
