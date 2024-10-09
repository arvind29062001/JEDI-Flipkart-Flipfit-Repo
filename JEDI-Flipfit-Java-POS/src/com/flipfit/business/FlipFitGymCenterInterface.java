package com.flipfit.business;

import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymSlot;

import java.util.List;
import java.util.Date;

public interface FlipFitGymCenterInterface {

    // View all gym centers
    List<FlipfitGym> viewAllGymCenters();

    // View available slots for a specific gym center
    List<FlipfitGymSlot> viewAvailableSlots(String gymId, Date date);

    // Get the nearest available slot for a specific gym center
    String getNearestSlot(String gymCenterId, Date date);


    List<FlipFitGymCenter> getAllCentresByOwmerId(String gymOwnerId);

    void requestGymCentreApproval(String gymCentreId);
}
