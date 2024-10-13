package com.flipfit.dao;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;

public interface FlipFitGymCenterDAOInterface {

    List<FlipFitGymCenter> getAllGymCenters();

    List<FlipFitGymCenter> getAllGymCentersByOwnerId(String gymOwnerId);

    FlipFitGymCenter getGymCenterById(String gymCenterId);

    void addGymCenter(FlipFitGymCenter gymCenter);

    List<FlipFitGymCenter> getPendingGymCentersList();

    void validateGymCenter(String gymCenterId, boolean isApproved);

    void sendGymCenterApprovalRequest(String gymCenterId);

    List<FlipFitGymCenter> getGymCentersListByCity(String city);
}
