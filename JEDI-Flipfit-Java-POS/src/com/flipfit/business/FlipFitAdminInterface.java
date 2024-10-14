package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;
/**
 * Interface defining operations that an admin can perform in the FlipFit system.
 */

public interface FlipFitAdminInterface {
    /**
     * Approves or rejects a gym center based on the provided ID.
     * @param gymCenterId ID of the gym center to approve/reject
     * @param isApproved True to approve, false to reject
     */

    void approveGymCenter(String gymCenterId, boolean isApproved);
    /**
     * Retrieves a list of pending gym centers awaiting approval.
     * @return List of pending gym centers
     */

    List<FlipFitGymCenter> getPendingGymCentersList();

    /**
     * Retrieves a list of all gym centers
     * @return List of all gymCentersList
     */

    List<FlipFitGymCenter> getAllGymCentersList();

    /**
     * removes GymCenter
     * @param gymCenterId
     */
    void removeGymCenter(String gymCenterId);
}
