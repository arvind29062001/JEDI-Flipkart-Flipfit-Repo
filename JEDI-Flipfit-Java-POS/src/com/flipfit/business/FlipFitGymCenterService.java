package com.flipfit.business;

import java.util.Date;
import java.util.List;

public class FlipFitGymCenterService implements FlipFitGymCenterInterface{
    @Override
    public List<FlipFitGymCenter> viewAllGymCenters() {
        return Collections.emptyList();

    }

    @Override
    public List<String> viewAvailableSlots(String gymCenterId, Date date) {
        return Collections.emptyList();

    }

    @Override
    public String getNearestSlot(String gymCenterId, Date date) {
        return "";
    }
}
