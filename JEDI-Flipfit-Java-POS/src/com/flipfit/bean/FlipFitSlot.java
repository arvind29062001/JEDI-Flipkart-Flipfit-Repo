package com.flipfit.bean;

import java.time.LocalTime;

public class FlipFitSlot {
    private String slotId;
    private String gymCenterId;
    private LocalTime slotTime;


    public FlipFitSlot(String slotId, String gymCenterId, LocalTime slotTime) {
        this.slotId = slotId;
        this.gymCenterId = gymCenterId;
        this.slotTime = slotTime;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getGymCenterId() {
        return gymCenterId;
    }

    public LocalTime getSlotTime() {
        return slotTime;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public void setGymCenterId(String gymCenterId) {
        this.gymCenterId = gymCenterId;
    }

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
