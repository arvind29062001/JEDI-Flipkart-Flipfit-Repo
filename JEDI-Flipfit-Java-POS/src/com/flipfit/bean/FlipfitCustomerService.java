package com.flipfit.bean;

import com.flipfit.bean.Booking;
import com.flipfit.bean.FlipfitCustomer;
import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymSlot;
import com.flipfit.business.FlipFitCustomerInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class FlipFitCustomerService implements FlipFitCustomerInterface {


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
    public void cancelSlot(String bookingID) {

    }

    @Override
    public void register(String userName, String password, String email, String phoneNumber, String cardNumber) {

    }

    @Override
    public FlipfitCustomer checkStatus(String userId, String gymId, String startTime) {
        return null;
    }

    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}