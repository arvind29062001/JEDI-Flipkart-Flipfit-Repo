package com.flipfit.bean;

import java.time.LocalTime;

public class FlipFitSlot {
    private String slotId;
    private String gymCenterId;
    private LocalTime slotTime;

    /**
     *
     * @param slotId is the slot id
     * @param gymCenterId is gymCenterId
     * @param slotTime is slotTime
     */
    public FlipFitSlot(String slotId, String gymCenterId, LocalTime slotTime) {
        this.slotId = slotId;
        this.gymCenterId = gymCenterId;
        this.slotTime = slotTime;
    }

    /**
     *
     * @return
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     *
     * @return gymCenterId
     */
    public String getGymCenterId() {
        return gymCenterId;
    }

    /**
     *
     * @return slotTime
     */
    public LocalTime getSlotTime() {
        return slotTime;
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
     * @param gymCenterId
     */
    public void setGymCenterId(String gymCenterId) {
        this.gymCenterId = gymCenterId;
    }

    /**
     *
     * @param slotTime
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
