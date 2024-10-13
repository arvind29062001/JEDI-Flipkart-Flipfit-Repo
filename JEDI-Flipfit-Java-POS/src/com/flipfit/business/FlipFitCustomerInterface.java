package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitSlot;
import com.flipfit.helper.UserPlan;

import java.util.Date;
import java.util.List;

public interface FlipFitCustomerInterface {

    void registerCustomer(String username, String email, String password, String phoneNumber,String govId);

    List<FlipFitGymCenter> getGymCentersListByCity(String city);

    List<FlipFitSlot> getAvailableSlots(String centerId, Date date);

    List<FlipFitBooking> getCustomerBookings(String customerId);

    boolean bookSlot(String customerId, Date date, String slotId, String centerId);

    void cancelBookingById(String bookingId);

    List<UserPlan> getCustomerPlan(String userName);

    boolean isUserValid(String userName, String password);

    FlipFitCustomer viewMyProfile(String userName);
}
