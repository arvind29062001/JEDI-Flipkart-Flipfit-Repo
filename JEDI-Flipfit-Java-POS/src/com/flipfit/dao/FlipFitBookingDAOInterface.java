package com.flipfit.dao;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.helper.UserPlan;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 * Data Access Object (DAO) interface for handling booking-related operations in FlipFit system.
 * This interface defines methods for adding, retrieving, canceling bookings,
 * checking booking overlaps, and managing customer plans.
 * @Author Shakti Singh
 */

public interface FlipFitBookingDAOInterface {
    /**
     * Adds a booking for a user identified by their username and schedule ID.
     * @param name,scheduleId ID of the schedule to book
     * @Author Shakti Singh
     */

    void addBooking(String name, String scheduleId);
    /**
     * Retrieves all bookings made by a customer identified by their customer ID.
     * @param customerId ID of the customer
     * @return List of bookings made by the customer
     * @Author Shakti Singh
     */

    List<FlipFitBooking> getBookingsListByCustomerId(String customerId);
    /**
     * Retrieves the plan details of a customer identified by their customer ID.
     * @param customerId ID of the customer
     * @return List of user plans associated with the customer
     * @Author Shakti Singh
     */

    List<UserPlan> getCustomerPlan(String customerId);
    /**
     * Cancels a booking based on its ID.
     * @param bookingId ID of the booking to cancel
     * @Author Shakti Singh
     */
    void cancelBookingById(String bookingId);
    /**
     * Checks if there is any overlap in bookings for a customer on a specific date and time.
     * @param customerId,date,localTime Time of the booking
     * @return True if there is an overlap, false otherwise
     * @Author Shakti Singh
     */
    boolean checkBookingOverlap(String customerId, Date date, LocalTime localTime);

    /**
     * Retrieves a booking based on its booking ID.
     * @param bookingId ID of the booking
     * @return The FlipFitBooking object
     * @Author Shakti Singh
     */
    FlipFitBooking getBookingByBookingId(String bookingId);
}
