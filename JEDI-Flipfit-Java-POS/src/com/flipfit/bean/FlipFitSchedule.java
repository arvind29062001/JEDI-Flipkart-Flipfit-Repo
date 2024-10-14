package com.flipfit.bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class FlipFitSchedule {
    private String scheduleId;
    private String slotId;
    private int availability;
    private Date date;

    /**
     *
     * @param date
     * @param slotId
     * @param availability
     */
    public FlipFitSchedule(Date date, String slotId, int availability)  {
        this.scheduleId = UUID.randomUUID().toString();
        this.date = date;
        this.slotId = slotId;
        this.availability = availability;
    }

    /**
     *
     * @return scheduleId
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     *
     * @return slotId
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     *
     * @return availability
     */
    public int getAvailability() {
        return availability;
    }

    /**
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param scheduleId
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     *
     * @param slotId
     */
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     *
     * @param availability
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

}
