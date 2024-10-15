package com.flipfit.bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
/**
 * Represents Schedule of any GymCentre Slot
 * @Author Arvind Yadav
 */

public class FlipFitSchedule {
    private String scheduleId;
    private String slotId;
    private int availability;
    private Date date;

    /**
     * Constructor for FlipFitSchedule.
     * @param date,slotId,availability the availability status of the slot (integer)
     * @Author Arvind Yadav
     */
    public FlipFitSchedule(Date date, String slotId, int availability)  {
        this.scheduleId = UUID.randomUUID().toString();
        this.date = date;
        this.slotId = slotId;
        this.availability = availability;
    }

    /**
     * Getter for the schedule ID.
     * @return the schedule ID
     * @Author Pratik Singh
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Getter for the slot ID associated with the schedule.
     * @return the slot ID
     * @Author Pratik Singh
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     * Getter for the availability status of the slot.
     * @return the availability status (integer)
     * @Author Pratik Singh
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * Getter for the date of the schedule.
     * @return the date of the schedule (LocalDate object)
     * @Author Pratik Singh
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for the schedule ID.
     * @param scheduleId the schedule ID to set
     * @Author Pratik Singh
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * Setter for the slot ID associated with the schedule.
     * @param slotId the slot ID to set
     * @Author Pratik Singh
     */
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     * Setter for the availability status of the slot.
     * @param availability the availability status to set
     * @Author Pratik Singh
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * Setter for the date of the schedule.
     * @param date the date to set for the schedule (LocalDate object)
     * @Author Pratik Singh
     */
    public void setDate(Date date) {
        this.date = date;
    }

}
