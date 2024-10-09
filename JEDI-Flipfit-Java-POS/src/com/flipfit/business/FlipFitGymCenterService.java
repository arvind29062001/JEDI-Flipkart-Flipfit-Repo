package com.flipfit.business;

import com.flipfit.bean.FlipfitGym;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FlipFitGymCenterService implements FlipFitGymCenterInterface {

    @Override
    public List<FlipfitGym> viewAllGymCenters() {
        return Collections.emptyList(); // Return an empty list for now
    }

    @Override
    public List<String> viewAvailableSlots(String gymId, Date date) {
        return Collections.emptyList(); // Return an empty list for now
    }

    @Override
    public String getNearestSlot(String gymId, Date date) {
        return ""; // Return an empty string for now
    }
}
