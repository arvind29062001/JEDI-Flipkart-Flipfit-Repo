package com.flipfit.business;
import com.flipfit.bean.Booking;
import com.flipfit.bean.FlipfitCustomer;
import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymSlot;
import java.util.Date;
import java.util.List;
public interface FlipFitCustomerInterface {
    List<FlipfitGym> viewGym(String city);
    List<FlipfitGymSlot> slotBooking(String centreID, Date date);
    List<Booking> viewBooking(String customerId);
    boolean bookSlot(String userID, Date date, String slotId, String centreId);
    boolean cancelSlot(String bookingID);
    FlipfitCustomer checkStatus(String userId, String gymId, String startTime);
    boolean login(String userName, String password);

    void registerCustomer(String userName, String password, String email, String phoneNumber, String cardNumber);
    boolean isUserValid(String userName, String password);

    List<FlipfitGymSlot> getAvailableSlots(String gymId, Date sqlDate);
}