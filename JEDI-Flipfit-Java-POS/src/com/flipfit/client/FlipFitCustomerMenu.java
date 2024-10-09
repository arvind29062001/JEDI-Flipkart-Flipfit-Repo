package com.flipfit.client;

import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.text.ParseException;

public class FlipFitCustomerMenu {
    public boolean customerLogin(String userName, String password) throws ParseException {
        if (valid) {
            System.out.println("Successfully logged in");
        } else {
            System.out.println("UserName or password doesn't match");
            return false;
        }
        return true;
    }

    public void customerRegister() throws ParseException {
        System.out.println("Enter your Username/Password/Email/Phone Number");
    }

    private void viewGym(String userName, String location) throws ParseException {
        System.out.println("Provide Location to search : ");
    }

    private void chooseSlot(String gymId, String userId, Date sqlDate, Timestamp startTime) throws ParseException {
        System.out.println("Choose from these Slots");
    }

    private void viewBookings(String userId){
        System.out.println("Bookings : ");
    }

    private void cancelSlot(String userId, String gymId){
        System.out.println("Select the Booking to cancel: ");

    }
    public static void checkStatus(String userId, String gymId, String startTime) throws ParseException {
        System.out.println("Your status is : ");
    }

}
