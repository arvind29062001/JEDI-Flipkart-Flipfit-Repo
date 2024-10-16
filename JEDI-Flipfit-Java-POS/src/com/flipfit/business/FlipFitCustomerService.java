package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitSlot;
import com.flipfit.dao.FlipFitCustomerDAO;
import com.flipfit.dao.FlipFitPaymentDAOInterface;
import com.flipfit.helper.UserPlan;
import com.flipfit.exceptions.RegistrationFailedException;
import com.flipfit.exceptions.UserInvalidException;
import com.flipfit.bean.FlipFitPayment;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class FlipFitCustomerService implements FlipFitCustomerInterface {

    private FlipFitGymCenterInterface gymCenterService = new FlipFitGymCenterService();
    private FlipFitBookingInterface bookingService = new FlipFitBookingService();
    private FlipFitScheduleInterface scheduleService = new FlipFitScheduleService();
    private FlipFitSlotInterface slotService = new FlipFitSlotService();
    private FlipFitCustomerDAO customerDAO = new FlipFitCustomerDAO();
    private FlipFitPaymentInterface paymentService = new FlipFitPaymentService();
    private FlipFitGymCenterInterface gymCenter= new FlipFitGymCenterService();

    public void registerCustomer(String username, String email, String password, String phoneNumber,String govId) {
        try {
            customerDAO.registerCustomer(username,password,email,phoneNumber,govId);
        } catch (RegistrationFailedException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<FlipFitGymCenter> getGymCentersListByCity(String city) {
        return gymCenterService.getGymCentersByCity(city);
    }

    public List<FlipFitSlot> getAvailableSlots(String centerId, Date date) {
      //  System.out.println(3);
        return gymCenterService.getAvailableSlotsByCenterAndDate(centerId, date);
    }

    public List<FlipFitBooking> getCustomerBookings(String customerId) {
        return bookingService.getBookingListByCustomerId(customerId);
    }

    public boolean bookSlot(String username, Date date, String slotId, String centerId) {
        if(!slotService.isSlotValid(slotId,centerId)){
            System.out.println("INVALID SLOT");
            return false;
        }

        String scheduleId = scheduleService.getOrCreateSchedule(slotId, date).getScheduleId();

//        System.out.println("SCHEDULE ID: " + scheduleId);
        //create booking

        boolean isOverlap = bookingService.checkBookingOverlap(username,date,slotId);

        if(isOverlap) {
            System.out.println("There exists a conflicting booking, First cancel it!!!!");
            return false;
        }

        // object of centrer is required

        System.out.println(" Choose one of the following opitons to pay for the slot selected : \n 1. Online. \n   2. Offline ");
        Scanner sc=new Scanner(System.in);
        int s =sc.nextInt();
        switch(s){
            case 1:
//                String paymentId = UUID.randomUUID().toString();
//                String bookingId = UUID.randomUUID().toString();
//                FlipFitPayment payment= new FlipFitPayment(paymentId,"200",bookingId);
//                paymentService.savePayment(new FlipFitPayment(paymentId,"200",bookingId));

                int amount = gymCenter.getGymCenterById(centerId).getPrice();


                boolean flag=true;
                while(flag){
                    System.out.println("Kindly pay amount :"+amount);
                    Scanner sc1=new Scanner(System.in);
                    int a=sc1.nextInt();
                    if(a!=amount)System.out.println("Kindly enter correct amount!");
                    else flag=false;

                }
                System.out.println("Payment Successful!");
                break;
            case 2 :
                System.out.println("You can pay on your visit for the slot if available at that moment.");
                break;
            default:
                System.out.println("Choose valid option!");
                break;
        }

        bookingService.addBooking(username, scheduleId);
        return true;
    }

    public void cancelBookingById(String bookingId) {
        bookingService.cancelBooking(bookingId);
    }

    public FlipFitCustomer viewMyProfile(String username) {
        return customerDAO.getCustomerByName(username);
    }

    public boolean isUserValid(String userName, String password) {
        try {
            return customerDAO.isUserValid(userName,password);
        } catch (UserInvalidException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<UserPlan> getCustomerPlan(String customerId){
        return bookingService.getCustomerPlan(customerId);
    }
}
