package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.helper.UserPlan;

import java.util.Date;
import java.util.List;
/**
 * Interface defining operations related to bookings in the FlipFit system.
 * @author Sabarnabhowmik
 */

public interface FlipFitBookingInterface {
    /**
     * Adds a booking for a user with a specific schedule ID.
     * @param id ID of the user making the booking
     * @param scheduleID ID of the schedule being booked
     */

    void addBooking(String id, String scheduleID);
    /**
     * Checks if there is any overlap in bookings for a customer on a specific date and slot.
     * @param customerId,date,slotId ID of the slot (time slot) for the booking
     * @return True if there is an overlap, false otherwise
     * @author Sabarnabhowmik
     */

    boolean checkBookingOverlap(String customerId, Date date, String slotId);

    /**
     * Retrieves a list of bookings made by a customer identified by their customer ID.
     * @param customerId ID of the customer
     * @return List of bookings made by the customer
     * @author Sabarnabhowmik
     */

    List<FlipFitBooking> getBookingListByCustomerId(String customerId);
    /**
     * Cancels a booking identified by its booking ID.
     * @param bookingID ID of the booking to cancel
     * @author Sabarnabhowmik
     */

    void cancelBooking(String bookingID);

    /**
     * Retrieves the plan(s) subscribed by a customer identified by their customer ID.
     * @param customerId ID of the customer
     * @return List of plans subscribed by the customer
     * @author Sabarnabhowmik
     */

    List<UserPlan> getCustomerPlan(String customerId);
}
