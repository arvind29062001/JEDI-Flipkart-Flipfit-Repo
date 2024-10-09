package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;
import java.util.Date;

public interface FlipFitGymCenterInterface {

    // View all gym centers
    List<FlipFitGymCenter> viewAllGymCenters();

    // View available slots for a specific gym center
    List<String> viewAvailableSlots(String gymCenterId, Date date);

    // Get the nearest available slot for a specific gym center
    String getNearestSlot(String gymCenterId, Date date);
}
