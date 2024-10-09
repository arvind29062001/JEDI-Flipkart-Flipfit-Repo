package com.flipfit.business;
import com.flipfit.bean.Booking;
import com.flipfit.bean.FlipfitCustomer;
import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymSlot;

import java.util.Date;
import java.util.List;
public class FlipFitCustomerService implements FlipFitCustomerInterface {
    @Override
    public List<FlipfitGym> viewGym(String city) {
        return List.of();
    }
    @Override
    public List<FlipfitGymSlot> slotBooking(String centreID, Date date) {
        return List.of();
    }
    @Override
    public List<Booking> viewBooking(String customerId) {
        return List.of();
    }
    @Override
    public boolean bookSlot(String userID, Date date, String slotId, String centreId) {
        return false;
    }
    @Override
    public boolean cancelSlot(String bookingID) {
        return false;
    }

    @Override
    public FlipfitCustomer checkStatus(String userId, String gymId, String startTime) {
        return null;
    }
    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    @Override
    public void registerCustomer(String userName, String password, String email, String phoneNumber, String cardNumber) {

    }

    @Override
    public boolean isUserValid(String userName, String password) {
        return false;
    }

    @Override
    public List<FlipfitGymSlot> getAvailableSlots(String gymId, Date sqlDate) {
        return List.of();
    }
}