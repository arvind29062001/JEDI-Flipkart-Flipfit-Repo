package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitSlot;

import java.util.Date;
import java.util.List;

/**
 * Interface defining operations related to gym centers in the FlipFit system.
 * @author Samarth Bhatt
 */

public interface FlipFitGymCenterInterface {

    /**
     * Interface defining operations related to gym centers in the FlipFit system.
     * @author Samarth Bhatt
     */
    List<FlipFitGymCenter> getAllGymCenters();

    /**
     * Retrieves details of all gym centers owned by a specific gym owner.
     * @param gymOwnerId ID of the gym owner
     * @return List of gym centers owned by the gym owner
     * @author Samarth Bhatt
     */
    List<FlipFitGymCenter> getGymCentersByOwnerId(String gymOwnerId);


    /**
     * Retrieves details of gym centers located in a specific city.
     * @param city City name
     * @return List of gym centers in the specified city
     * @author Samarth Bhatt
     */
    List<FlipFitGymCenter> getGymCentersByCity(String city);

    /**
     * Retrieves available slots for booking at a specific gym center on a given date.
     * @param centerId,date Date for which slots are to be retrieved
     * @return List of available slots
     * @author Samarth Bhatt
     */
    List<FlipFitSlot> getAvailableSlotsByCenterAndDate(String centerId, Date date);


    /**
     * Adds a new gym center to the system.
     * @param gymCenter Gym center object to add
     * @author Samarth Bhatt
     *
     */
    void addCenter(FlipFitGymCenter gymCenter);

    /**
     * Requests approval for a gym center identified by its ID.
     * @param gymCenterId ID of the gym center to request approval for
     * @author Samarth Bhatt
     */
    void requestGymCenterApproval(String gymCenterId);

    /**
     * Retrieves details of a gym center identified by its ID.
     * @param gymCenterId ID of the gym center
     * @return Gym center object
     * @author Samarth Bhatt
     */
    FlipFitGymCenter getGymCenterById(String gymCenterId);
}
