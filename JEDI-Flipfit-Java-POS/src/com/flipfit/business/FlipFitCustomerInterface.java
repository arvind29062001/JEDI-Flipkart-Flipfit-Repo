package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitSlot;
import com.flipfit.helper.UserPlan;

import java.util.Date;
import java.util.List;
/**
 * Interface defining operations related to customers in the FlipFit system.
 */
public interface FlipFitCustomerInterface {

    /**
     * Registers a new customer with the provided details.
     * @param username,password,email,phoneNumber,govId
     * @Author Samarth Bhatt
     */
    void registerCustomer(String username, String email, String password, String phoneNumber,String govId);

    /**
     * Retrieves details of all gym centers in a specific city.
     * @param city City name
     * @return List of gym center details
     * @Author Samarth Bhatt
     */
    List<FlipFitGymCenter> getGymCentersListByCity(String city);

    /**
     * Retrieves available slots for booking at a specific gym center on a given date.
     * @param centerId,date Date for which slots are to be retrieved
     * @return List of available slots
     * @Author Samarth Bhattowmik
     */
    List<FlipFitSlot> getAvailableSlots(String centerId, Date date);

    /**
     * Retrieves bookings made by a customer identified by their customer ID.
     * @param customerId ID of the customer
     * @return List of customer bookings
     * @Author Samarth Bhatt
     */
    List<FlipFitBooking> getCustomerBookings(String customerId);

    /**
     * Books a slot for a user at a specific gym center on a given date and slot ID.
     * @param customerId,date,slotId,centerId ID of the gym center
     * @return True if booking is successful, false otherwise
     * @Author Samarth Bhatt
     */
    boolean bookSlot(String customerId, Date date, String slotId, String centerId);

    /**
     * Cancels a booking identified by its booking ID.
     * @param bookingId ID of the booking to cancel
     * @Author Samarth Bhatt
     */
    void cancelBookingById(String bookingId);

    /**
     * Retrieves the plan(s) subscribed by a customer identified by their username.
     * @param userName Username of the customer
     * @return List of plans subscribed by the customer
     * @Author Samarth Bhatt
     */
    List<UserPlan> getCustomerPlan(String userName);

    /**
     * Checks if a user with the provided username and password exists and is valid.
     * @param userName Username of the user
     * @param password Password of the user
     * @return True if the user is valid, false otherwise
     * @Author Samarth Bhatt
     */
    boolean isUserValid(String userName, String password);


    /**
     * Retrieves the profile details of a customer identified by their username.
     * @param userName Username of the customer
     * @return Customer profile information
     * @Author Samarth Bhatt
     */
    FlipFitCustomer viewMyProfile(String userName);
}
