package com.flipfit.bean;

public class FlipFitBooking {
    private String bookingId;
    private String customerId;
    private String scheduleId;


    public FlipFitBooking(String customerId, String scheduleId) {
        this.customerId = customerId;
        this.scheduleId = scheduleId;
    }

    public FlipFitBooking(String bookingId, String customerId, String scheduleId) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.scheduleId = scheduleId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }
}
