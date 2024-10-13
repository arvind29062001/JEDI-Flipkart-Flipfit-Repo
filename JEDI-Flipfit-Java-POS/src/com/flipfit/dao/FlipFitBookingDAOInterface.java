package com.flipfit.dao;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.helper.UserPlan;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public interface FlipFitBookingDAOInterface {

    void addBooking(String name, String scheduleId);

    List<FlipFitBooking> getBookingsListByCustomerId(String customerId);

    List<UserPlan> getCustomerPlan(String customerId);

    void cancelBookingById(String bookingId);

    boolean checkBookingOverlap(String customerId, Date date, LocalTime localTime);

    FlipFitBooking getBookingByBookingId(String bookingId);
}
