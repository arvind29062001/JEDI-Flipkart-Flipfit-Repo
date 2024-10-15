package com.flipfit.bean;

import java.time.LocalTime;
/**
 * Represents a slot of a FlipFit GymCentre
 * @author Arvind Yadav
 */

public class FlipFitSlot {
    private String slotId;
    private String gymCenterId;
    private LocalTime slotTime;

    /**
     *
     * @param slotId,gymCenterId,slotTime is slotTime
     * @author Arvind Yadav
     */
    public FlipFitSlot(String slotId, String gymCenterId, LocalTime slotTime) {
        this.slotId = slotId;
        this.gymCenterId = gymCenterId;
        this.slotTime = slotTime;
    }

    /**
     * Getter for the slot ID.
     * @return the slot ID
     * @author Arvind Yadav
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     * Getter for the center ID.
     * @return the center ID
     * @author Arvind Yadav
     */
    public String getGymCenterId() {
        return gymCenterId;
    }

    /**
     * Getter for the time of the slot.
     * @return the time of the slot (LocalTime object)
     * @author Arvind Yadav
     */

    public LocalTime getSlotTime() {
        return slotTime;
    }

    /**
     * Setter for the slot ID.
     * @param slotId the slot ID to set
     * @author Arvind Yadav
     */
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     * Setter for the center ID.
     * @param gymCenterId the center ID to set
     * @author Arvind Yadav
     */

    public void setGymCenterId(String gymCenterId) {
        this.gymCenterId = gymCenterId;
    }

    /**
     * Setter for the time of the slot.
     * @param slotTime the time to set for the slot (LocalTime object)
     * @author Arvind Yadav
     */

    public void setSlotTime(LocalTime slotTime) {
        this.slotTime = slotTime;
    }


    @Override
    public String toString() {
        return "FlipFitSlot{" +
                "slotId='" + slotId + '\'' +
                ", gymCenterId='" + gymCenterId + '\'' +
                ", slotTime=" + slotTime +
                '}';
    }



}
