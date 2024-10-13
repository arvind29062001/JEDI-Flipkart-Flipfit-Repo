package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitSlot;

import java.util.Date;
import java.util.List;

public interface FlipFitGymCenterInterface {

    List<FlipFitGymCenter> getAllGymCenters();

    List<FlipFitGymCenter> getGymCentersByOwnerId(String gymOwnerId);

    List<FlipFitGymCenter> getGymCentersByCity(String city);

    List<FlipFitSlot> getAvailableSlotsByCenterAndDate(String centerId, Date date);

    void addCenter(FlipFitGymCenter gymCenter);

    void requestGymCenterApproval(String gymCenterId);

    FlipFitGymCenter getGymCenterById(String gymCenterId);
}
