package com.flipfit.dao;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitSchedule;
import com.flipfit.helper.UserPlan;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class FlipFitBookingDAO implements FlipFitBookingDAOInterface {
    private List<FlipFitBooking> bookingList = new ArrayList<>();
    private static FlipFitScheduleDAO flipFitScheduleDAO = new FlipFitScheduleDAO();

    public void addBooking(String name, String scheduleId) {
        try {
            String bookingId = name + scheduleId;
            FlipFitBooking booking = new FlipFitBooking(bookingId, name, scheduleId);
            bookingList.add(booking);
            System.out.println("Booking added successfully");
        } catch (Exception e) {
            System.out.println("Booking failed for current slot. Try again later.");
        }
    }

    public List<FlipFitBooking> getBookingsListByCustomerId(String customerId) {
        List<FlipFitBooking> customerBookings = new ArrayList<>();
        for (FlipFitBooking booking : bookingList) {
            if (booking.getCustomerId().equals(customerId)) {
                customerBookings.add(booking);
            }
        }
        return customerBookings;
    }

    public List<UserPlan> getCustomerPlan(String customerId) {
        List<UserPlan> allUserPlan = new ArrayList<>();
        try {
            List<FlipFitBooking> customerBookings = getBookingsListByCustomerId(customerId);
            for (FlipFitBooking booking : customerBookings) {
                FlipFitSchedule schedule = flipFitScheduleDAO.getScheduleById(booking.getScheduleId());
                UserPlan userPlan = new UserPlan(
                        schedule.getSlotId(),
                        schedule.getSlotId(),
                        schedule.getDate().atStartOfDay().toLocalTime(),
                        schedule.getScheduleId(),
                        schedule.getDate()
                );
                allUserPlan.add(userPlan);
            }
        } catch (Exception e) {
            System.out.println("Failed to get customer plan");
        }
        return allUserPlan;
    }

    public boolean checkBookingOverlap(String customerId, Date date, LocalTime localTime) {
        LocalTime endTime = localTime.plusHours(1);
        List<UserPlan> allUserPlan = getCustomerPlan(customerId);

        // Use stream to iterate over allUserPlan and check for overlap
        return allUserPlan.stream()
                .filter(userPlan -> userPlan.getDate().equals(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()))
                .anyMatch(userPlan -> {
                    LocalTime bookedStartTime = userPlan.getTime();
                    LocalTime bookedEndTime = bookedStartTime.plusHours(1);
                    return localTime.isBefore(bookedEndTime) && endTime.isAfter(bookedStartTime);
                });
    }

    public void cancelBookingById(String bookingID) {
        Optional<FlipFitBooking> bookingToRemove = bookingList.stream()
                .filter(booking -> booking.getBookingId().equals(bookingID))
                .findFirst();

        if (bookingToRemove.isPresent()) {
            bookingList.remove(bookingToRemove.get());
            System.out.println("Booking canceled successfully");
        } else {
            System.out.println("Could not cancel booking for BookingId: " + bookingID);
        }
    }

    public FlipFitBooking getBookingByBookingId(String bookingId) {
        Optional<FlipFitBooking> optionalBooking = bookingList.stream()
                .filter(booking -> booking.getBookingId().equals(bookingId))
                .findFirst();

        if (optionalBooking.isPresent()) {
            return optionalBooking.get();
        } else {
            System.out.println("Could not fetch booking by bookingId: " + bookingId);
            return null;
        }
    }
}
