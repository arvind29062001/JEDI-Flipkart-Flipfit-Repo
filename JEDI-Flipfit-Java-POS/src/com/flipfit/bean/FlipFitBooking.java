package com.flipfit.bean;

/**
 * Represents a booking in the FlipFit system.
 * A booking links a user to a specific schedule.
 * @author Arvind Yadav
 */

public class FlipFitBooking {
    private String bookingId;
    private String customerId;
    private String scheduleId;
    /**
     * Parameterized constructor to create a new booking.
     * @param customerId,scheduleId
     * @author Arvind Yadav
     */

    public FlipFitBooking(String customerId, String scheduleId) {
        this.customerId = customerId;
        this.scheduleId = scheduleId;
    }
    /**
     * Parameterized constructor to create a booking with existing ID.
     * @param bookingId,customerId,scheduleId
     * @author Arvind Yadav
     */

    public FlipFitBooking(String bookingId, String customerId, String scheduleId) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.scheduleId = scheduleId;
    }

     /**
     * Retrieves the bookingId
     * @return bookingId
      * @author Arvind Yadav
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     *  returns customerId
     * @return customerId
     * @author Arvind Yadav
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * returns schedule Id
     * @return schedule Id
     * @author Arvind Yadav
     */
    public String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the booking ID.
     * @param bookingId bookingId to set
     * @author Arvind Yadav
     */

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    /**
     * Sets the customer ID associated with the booking.
     * @param customerId ID to set
     * @author Arvind Yadav
     */

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * sets schedule id
     * @param scheduleId
     * @author Arvind Yadav
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }
}
