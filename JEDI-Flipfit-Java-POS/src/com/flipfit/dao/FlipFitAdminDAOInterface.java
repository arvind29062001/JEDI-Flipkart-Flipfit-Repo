package com.flipfit.dao;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;
/**
 * Data Access Object (DAO) interface for handling administrative tasks in FlipFit system.
 * This interface defines methods related to gym owners and gym centers approval/validation.
 * @Author Shakti Singh
 */

public interface FlipFitAdminDAOInterface {
    /**
     * Retrieves a list of pending gym owners awaiting approval.
     * @return List of pending gym owners
     * @Author Shakti Singh
     */

    List<FlipFitGymCenter> getPendingGymCentersList();
    /**
     * Validates (approves or rejects) a gym owner based on the given ID.
     * @param gymOwnerId ID of the gym owner to validate
     * @param isApproved True to approve, false to reject
     * @Author Shakti Singh
     */

    void validateGymCenter(String gymCenterId, boolean isApproved);

    /**
     * @return FlipFitGymCentre
     * @Author Shakti Singh
     */
    List<FlipFitGymCenter> getAllGymCentersList();

    /**
     * removes GymCenter by GymCenterId
     * @param gymCenterId
     * @Author Shakti Singh
     */
    void removeGymCenter(String gymCenterId);
}
