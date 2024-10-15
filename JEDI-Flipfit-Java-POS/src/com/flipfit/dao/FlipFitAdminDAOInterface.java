package com.flipfit.dao;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;
/**
 * Data Access Object (DAO) interface for handling administrative tasks in FlipFit system.
 * This interface defines methods related to gym owners and gym centers approval/validation.
 * @author Shakti Singh
 */

public interface FlipFitAdminDAOInterface {
    /**
     * Retrieves a list of pending gym owners awaiting approval.
     * @return List of pending gym owners
     * @author Shakti Singh
     */

    List<FlipFitGymCenter> getPendingGymCentersList();
    /**
     * Validates (approves or rejects) a gym owner based on the given ID.
     * @param gymCenterId,isApproved True to approve, false to reject
     * @author Shakti Singh
     */

    void validateGymCenter(String gymCenterId, boolean isApproved);

    /**
     * @return FlipFitGymCentre
     * @author Shakti Singh
     */
    List<FlipFitGymCenter> getAllGymCentersList();

    /**
     * removes GymCenter by GymCenterId
     * @param gymCenterId
     * @author Shakti Singh
     */
    void removeGymCenter(String gymCenterId);
}
