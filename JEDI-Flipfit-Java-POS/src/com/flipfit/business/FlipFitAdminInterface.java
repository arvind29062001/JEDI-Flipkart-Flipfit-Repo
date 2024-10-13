package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;

public interface FlipFitAdminInterface {

    void approveGymCenter(String gymCenterId, boolean isApproved);

    List<FlipFitGymCenter> getPendingGymCentersList();

    List<FlipFitGymCenter> getAllGymCentersList();

    void removeGymCenter(String gymCenterId);
}
