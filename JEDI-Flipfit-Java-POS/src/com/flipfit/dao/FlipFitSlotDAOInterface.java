package com.flipfit.dao;

import com.flipfit.bean.FlipFitSlot;

import java.util.List;
/**
 * Data Access Object (DAO) interface for handling slot-related operations in FlipFit system.
 * This interface defines methods for retrieving slots, adding slots, and fetching slots by specific criteria.
 * @Author Ravi Teja
 */

public interface FlipFitSlotDAOInterface {
    /**
     * Retrieves a list of all slots.
     * @return List of all slots
     * @Author Ravi Teja
     */

    List<FlipFitSlot> getSlotList();

    /**
     * Retrieves a list of slots associated with a specific gym center.
     * @param centerId ID of the gym center
     * @return List of slots associated with the specified gym center
     * @Author Ravi Teja
     */

    List<FlipFitSlot> getSlotListByCenterId(String centerId);

    /**
     * Adds a new slot to the system.
     * @param slot The FlipFitSlot object representing the slot to add
     * @Author Ravi Teja
     */

    void addSlot(FlipFitSlot slot);

    /**
     * Retrieves a slot based on its ID.
     * @param slotId ID of the slot to retrieve
     * @return The FlipFitSlot object
     * @Author Ravi Teja
     */
    FlipFitSlot getSlotById(String slotId);

    /**
     * Retrieves a slot based on its ID and associated gym center ID.
     * @param slotId,centerId ID of the gym center
     * @return The FlipFitSlot object
     * @Author Ravi Teja
     */
    FlipFitSlot getSlotByIdAndCenterId(String slotId, String centerId);
}
