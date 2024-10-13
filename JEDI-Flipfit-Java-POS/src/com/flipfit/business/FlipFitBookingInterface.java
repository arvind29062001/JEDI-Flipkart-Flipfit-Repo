package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.helper.UserPlan;

import java.util.Date;
import java.util.List;

public interface FlipFitBookingInterface {

    void addBooking(String id, String scheduleID);

    boolean checkBookingOverlap(String customerId, Date date, String slotId);

    List<FlipFitBooking> getBookingListByCustomerId(String customerId);

    void cancelBooking(String bookingID);

    List<UserPlan> getCustomerPlan(String customerId);
}
