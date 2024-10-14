package com.flipfit.client;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitSlot;
import com.flipfit.business.FlipFitCustomerInterface;
import com.flipfit.business.FlipFitCustomerService;
import static com.flipfit.helper.Helper.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FlipFitCustomerMenu {
    private static Scanner scanner = new Scanner(System.in);
    private FlipFitCustomerInterface customerService = new FlipFitCustomerService();
    private Object userName;

    public boolean customerLogin(String username, String password) {
        if (customerService.isUserValid(username, password)) {
            System.out.println("Successfully logged in");
            customerMainPage(username);
        } else {
            System.out.println("UserName or password doesn't match");
            return false;
        }
        return true;
    }


    private void bookSlotSubMenu(String userName) {
        System.out.println("Provide Location to search : ");
        String location = scanner.next();
        List<FlipFitGymCenter> centreListByLocation = customerService.getGymCentersListByCity(location);

        if(centreListByLocation.isEmpty()){
            System.out.println("There are no available GYM Centres in " + location + ". Please Select some other location");
            bookSlotSubMenu(userName);
            return;
        } else {
            printGymCenters(centreListByLocation);
            System.out.print("Choose a gymCentre ID to proceed: ");
            String chosenGym = scanner.next();
            Date date = selectDate();
            System.out.println(1);
            chooseSlot(chosenGym,userName,date,chosenGym);
        }
    }

    private void chooseSlot(String gymCentreId, String userName, Date sqlDate, String centreId) {
        System.out.println("Choose from the Below Slots");
        System.out.println(2);
        List<FlipFitSlot> availableSlots = customerService.getAvailableSlots(gymCentreId,sqlDate);

        if(availableSlots.isEmpty()){
            System.out.println("There are no available slots in the " + gymCentreId + ". Please Select some other gym");
            bookSlotSubMenu(userName);
            return;
        } else {
            printSlots(availableSlots);
            System.out.println("Enter SlotID");
            String slotID = scanner.next();
            System.out.println(slotID);

            if(!customerService.bookSlot(userName, sqlDate, slotID, centreId)) chooseSlot(gymCentreId, userName, sqlDate,centreId);
        }
    }

    private void printbookingsSubMenu(String userName){
        System.out.println("Bookings : ");
        List<FlipFitBooking> allBookingList= customerService.getCustomerBookings(userName);
        System.out.println("-----");
        System.out.printf("%-8s\t", "BOOKING-ID");
        System.out.printf("%47s\t\n", "SCHEDULE-ID");
        System.out.println("-----");
        for(FlipFitBooking booking: allBookingList) {
            System.out.printf("%-8s\t", booking.getBookingId());
            System.out.printf("%-8s\t\n", booking.getScheduleId());
        }
        System.out.println("----");
    }

    private void cancelBookingSubMenu(String userName){
        printbookingsSubMenu(userName);
        System.out.println("Select the Booking you want to cancel: ");
        String bookingId = scanner.next();
        customerService.cancelBookingById(bookingId);

    }

    public void customerMainPage(String username) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentTime.format(myFormat);
        System.out.println("WELCOME "+ username+" !!\nPlease choose among the following options\nLogin TIME: "+ formattedDate);

        while(true){
            System.out.println("1. View all gyms by city \n2. Book a slot in a Gym \n3. View Bookings\n4. Cancel Bookings\n5. Go Back to previous menu");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Please enter your city name");
                    String city = scanner.next();
                    System.out.println(city);
                    printGymCenters(customerService.getGymCentersListByCity(city));
                    break;
                case 2:
                    bookSlotSubMenu(username);
                    break;
                case 3:
                    printbookingsSubMenu(username);
                    break;
                case 4:
                    cancelBookingSubMenu(username);
                    break;
                case 5:
                    System.out.println("Taking back to previous menu");
                    return;
                default:
                    System.out.println("Not a valid choice");
                    break;
            }
        }
    }

    public void register() {
        System.out.println("Enter your username");
        String username = scanner.nextLine();

        System.out.println("Enter your password");
        String password = scanner.nextLine();

        System.out.println("Enter your email");
        String email = scanner.nextLine();

        System.out.println("Enter you phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter the govId( Adhaar No.) ");
        String govId= scanner.nextLine();

        customerService.registerCustomer(username, password, email, phoneNumber,govId);
        customerMainPage(username);
    }
}
