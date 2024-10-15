package com.flipfit.business;

import com.flipfit.bean.FlipFitSchedule;
import com.flipfit.bean.FlipFitSlot;

import java.util.Date;
import java.util.List;

/**
 * Interface defining operations related to schedules in the FlipFit system.
 * @author Sabarnabhowmik
 */
public interface FlipFitScheduleInterface {

    /**
     * Creates a new schedule for a given date and slot ID.
     * @param date,slotId ID of the slot (time slot)
     * @return The created FlipFitSchedule object
     * @author Sabarnabhowmik
     */
    FlipFitSchedule createSchedule(Date date, String slotId);

    /**
     * Retrieves a schedule based on slot ID and date.
     * @param slotId,date Date of the schedule
     * @return The FlipFitSchedule object
     * @author Sabarnabhowmik
     */
    FlipFitSchedule getScheduleByDateAndSlotId(Date date, String slotId);

    /**
     * Modifies a schedule based on its ID and action.
     * @param scheduleId,action Action to perform on the schedule (e.g., update, delete)
     * @return True if modification is successful, false otherwise
     * @author Sabarnabhowmik
     */
    boolean modifySchedule(String scheduleId, int action);

    /**
     * Checks availability of schedules for a given gym center and date.
     * @param centerId,date Date to check for schedule availability
     * @return List of available schedules
     * @author Sabarnabhowmik
     */
    List<FlipFitSchedule> checkAvailability(String centerId, Date date);

    /**
     * Retrieves all available slots for a given gym center and date.
     * @param centerId,date Date to retrieve available slots
     * @return List of available slots
     * @author Sabarnabhowmik
     */
    List<FlipFitSlot> getAllAvailableSlotsByDate(String centerId, Date date);


    /**
     * Retrieves or creates a schedule for a given slot ID and date.
     * @param slotId,date Date of the schedule
     * @return The retrieved or created FlipFitSchedule object
     * @author Sabarnabhowmik
     */
    FlipFitSchedule getOrCreateSchedule(String slotId, Date date);
}
