package com.flipfit.client;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.flipfit.bean.Booking;
import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymSlot;
import com.flipfit.business.FlipFitCustomerInterface;
import com.flipfit.business.FlipFitCustomerService;

public class FlipFitCustomerMenu {
    private FlipFitCustomerInterface customerService = new FlipFitCustomerService();
    private Scanner scanner = new Scanner(System.in);

    public boolean customerLogin(String userName, String password) throws ParseException {
        System.out.println("Logging in with Username: " + userName);
        if (customerService.isUserValid(userName, password)) {
            System.out.println("Successfully logged in");
            return true;
        } else {
            System.out.println("UserName or password doesn't match");
            return false;
        }
    }

    public void customerRegister() throws ParseException {
        System.out.println("Enter your Username");
        String userName = scanner.next();
        System.out.println("Enter your Password");
        String password = scanner.next();
        System.out.println("Enter your Email");
        String email = scanner.next();
        System.out.println("Enter your Phone Number");
        String phoneNumber = scanner.next();
        System.out.println("Enter your Card Number");
        String cardNumber = scanner.next();

        customerService.registerCustomer(userName, password, email, phoneNumber, cardNumber);
        System.out.println("Registration successful! Please log in.");
    }

    private void viewGym(String userName, String location) throws ParseException {
        System.out.println("Searching for gyms in location: " + location);
        List<FlipfitGym> centerListByLocation = customerService.viewGym(location);
//        Util.printGymCentres(centerListByLocation);

        if (centerListByLocation.isEmpty()) {
            System.out.println("No gym centers found in " + location);
        }
    }

    private void chooseSlot(String gymId, String userId, Date sqlDate, Timestamp startTime) throws ParseException {
        System.out.println("Choosing slot for Gym ID: " + gymId);
        List<FlipfitGymSlot> availableSlots = customerService.getAvailableSlots(gymId, sqlDate);
//        printSlots(availableSlots);

        if (availableSlots.isEmpty()) {
            System.out.println("No available slots.");
            return;
        }

        System.out.println("Enter SlotID");
        String slotID = scanner.next();
        if (!customerService.bookSlot(userId, sqlDate, slotID, gymId)) {
            System.out.println("Slot booking failed. Please try again.");
        } else {
            System.out.println("Slot booked successfully!");
        }
    }

    private void viewBookings(String userId) {
        System.out.println("Viewing bookings for User ID: " + userId);
        List<Booking> allBookingList = customerService.viewBooking(userId);
        System.out.println("-----");
        System.out.println("BOOKING-ID");
        System.out.println("SCHEDULE-ID");
        System.out.println("-----");
//        for (Booking booking : allBookingList) {
////            System.out.printf("%-8s\t", booking.getBookingID());
////            System.out.printf("%-8s\t\n", booking.getScheduleID());
//        }
        System.out.println("----");
    }

    private void cancelSlot(String userId, String gymId) {
        viewBookings(userId);
        System.out.println("Select the Booking you want to cancel: ");
        String bookingId = scanner.next();
        if (customerService.cancelSlot(bookingId)) {
            System.out.println("Booking canceled successfully!");
        } else {
            System.out.println("Cancellation failed. Please try again.");
        }
    }

    public static void checkStatus(String userId, String gymId, String startTime) throws ParseException {
        System.out.println("Checking status for User ID: " + userId + ", Gym ID: " + gymId + ", Start Time: " + startTime);
//        Booking booking = customerService.getBookingStatus(userId, gymId, Timestamp.valueOf(startTime));
//        if (booking != null) {
//            System.out.println("Your booking status is: " + booking.checkStatus());
//        } else {
//            System.out.println("No bookings found for the given criteria.");
//        }
    }
}
