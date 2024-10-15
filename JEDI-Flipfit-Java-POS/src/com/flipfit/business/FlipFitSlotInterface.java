package com.flipfit.business;

import com.flipfit.bean.FlipFitSlot;

import java.util.List;

/**
 * Interface defining operations related to slots in the FlipFit system.
 * @author Pratik Singh
 */
public interface FlipFitSlotInterface {

    /**
     * Retrieves all slots associated with a specific gym center.
     * @param centerId ID of the gym center
     * @return List of slots for the gym center
     * @author Pratik Singh
     */
    List<FlipFitSlot> getAllSlotsByGymCenter(String centerId);


    /**
     * Retrieves a slot based on its ID.
     * @param slotID ID of the slot
     * @return The FlipFitSlot object
     * @author Pratik Singh
     */
    FlipFitSlot getSlotById(String slotID);

    /**
     * Retrieves a list of all slots.
     * @return List of all slots
     * @author Pratik Singh
     */
    List<FlipFitSlot> getSlotList();

    /**
     * Adds slots to a gym center identified by its ID.
     * @param gymCenterId ID of the gym center
     * @param slotList List of slots to add
     * @author Pratik Singh
     */
    void addSlotsForGym(String gymCenterId, List<FlipFitSlot> slotList);

    /**
     * Checks if a slot is valid for a specific gym center.
     * @param slotId,centerId ID of the gym center
     * @return True if the slot is valid, false otherwise
     * @author Pratik Singh
     */
    boolean isSlotValid(String slotId, String centerId);



    /**
     * Retrieves a slot based on its ID and gym center ID.
     * @param slotID,centerId ID of the gym center
     * @return The FlipFitSlot object
     * @author Pratik Singh
     */
    FlipFitSlot getSlotByIdAndGymCenterId(String slotID, String centerId);
}

