package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCenter;

import java.util.List;
/**
 * Interface defining operations that an admin can perform in the FlipFit system.
 * @author Sabarnabhowmik
 */

public interface FlipFitAdminInterface {
    /**
     * Approves or rejects a gym center based on the provided ID.
     * @param gymCenterId,isApproved True to approve, false to reject
     * @author Sabarnabhowmik
     */

    void approveGymCenter(String gymCenterId, boolean isApproved);
    /**
     * Retrieves a list of pending gym centers awaiting approval.
     * @return List of pending gym centers
     * @author Sabarnabhowmik
     */

    List<FlipFitGymCenter> getPendingGymCentersList();

    /**
     * Retrieves a list of all gym centers
     * @return List of all gymCentersList
     * @author Sabarnabhowmik
     */

    List<FlipFitGymCenter> getAllGymCentersList();

    /**
     * removes GymCenter
     * @param gymCenterId
     * @author Sabarnabhowmik
     */
    void removeGymCenter(String gymCenterId);
}
