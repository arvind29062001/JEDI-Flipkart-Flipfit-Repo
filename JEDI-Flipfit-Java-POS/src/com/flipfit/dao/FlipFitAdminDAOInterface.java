package com.flipfit.dao;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;

public interface FlipFitAdminDAOInterface {

    List<FlipFitGymCenter> getPendingGymCentersList();

    void validateGymCenter(String gymCenterId, boolean isApproved);

    List<FlipFitGymCenter> getAllGymCentersList();

    void removeGymCenter(String gymCenterId);
}
