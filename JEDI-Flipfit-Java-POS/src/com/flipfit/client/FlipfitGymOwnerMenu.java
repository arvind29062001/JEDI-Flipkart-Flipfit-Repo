package com.flipfit.client;

import com.flipfit.bean.FlipfitGymSlot;
import com.flipfit.business.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlipfitGymOwnerMenu {

    private FlipFitGymOwnerInterface gymOwnerService = new FlipFitGymOwnerService();
    private FlipFitSlotInterface slotService = new FlipFitSlotService();
    private FlipFitGymCenterInterface gymCentreService = new FlipFitGymCenterService();
    Scanner scanner=new Scanner(System.in);


    public boolean gymOwnerLogin(String userName, String password) {
        if (gymOwnerService.loginGymOwner(userName,password)) {
            System.out.println("Successfully logged in");
            gymOwnerClientMainPage(userName);
        } else {
            return false;
        }
        return true;
    }



    public void register() {

        System.out.println("Enter your Username");
        String userName = scanner.next();

        System.out.println("Enter your Password");
        String password = scanner.next();

        System.out.println("Enter your Email");
        String email = scanner.next();

        System.out.println("Enter your PAN Number");
        String panNumber = scanner.next();

        System.out.println("Enter your Card Number");
        String cardNumber = scanner.next();

        gymOwnerService.registerGymOwner(userName,userName,password,email,panNumber,cardNumber);
//        gymOwnerClientMainPage(userName);
    }


    public void gymOwnerClientMainPage(String gymOwnerId) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentTime.format(myFormat);
        System.out.println("Welcome " + gymOwnerId + " !!\nPlease choose from the following options\nLogin TIME: " + currentTime);
        while (true) {
            System.out.println("" +
                    "0. View all Gym Centres\n" +
                    "1. Send Gym Owner Approval Request to Admin\n" +
                    "2. Add new Gym Center\n" +
                    "3. Send Gym Centre Approval Request to Admin\n" +
                    "4. Add Slots to a Gym Centre\n" +
                    "5. Go Back to Previous Menu"
            );
            int choice = scanner.nextInt();
            switch (choice) {

                case 0:
                    List<FlipFitGymCenter> allGymCentres = gymCentreService.getAllCentresByOwmerId(gymOwnerId);
                    printGymCentres(allGymCentres);
                    break;

                case 1:
                    gymOwnerService.requestGymOwnerApproval(gymOwnerId);
                    break;

                case 2:
                    System.out.println("Enter gym centre id: ");
                    String gymId = scanner.next();

                    System.out.println("Enter Gym Centre name: ");
                    String gymCentreName = scanner.next();

                    System.out.println("Enter Gym Centre GSTIN: ");
                    String gstin = scanner.next();

                    System.out.println("Enter Gym Centre city: ");
                    String city = scanner.next();

                    System.out.println("Enter Gym Centre capacity: ");
                    int capacity = scanner.nextInt();

                    System.out.println("Enter price: ");
                    int price = scanner.nextInt();

                    gymCentreService.addCenter(
                            new FlipFitGymCenter(
                                    gymId,
                                    gymOwnerId,
                                    gymCentreName,
                                    gstin,
                                    city,
                                    capacity,
                                    price,
                                    false
                            )
                    );
                    break;

                case 3:

                    System.out.println("Enter Gym Centre Id: ");
                    String gymCentreId = scanner.next();

                    gymCentreService.requestGymCentreApproval(gymCentreId);
                    break;

                case 4:

                    boolean isAdding = true;


                    List<FlipfitGymSlot> newSlotList = new ArrayList<>();
                    while (isAdding) {

                        System.out.println("Enter Gym Centre Id: ");
                        String gymId = scanner.next();

                        System.out.println("Enter booking Date ");
                        String bookingDate = scanner.next();

                        System.out.println("Enter time in 24h format (hh:mm:ss) : ");
                        String startTime = scanner.next();

//                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//                        LocalTime  startTime= LocalTime.parse(startTime, formatter);

                        newSlotList.add(new FlipfitGymSlot(
                                gymId,
                                bookingDate,
                                startTime


                        ));

                        System.out.println("Do you want to enter more slots (y/n)?: ");
                        String addChoice = scanner.next();
                        addChoice = addChoice.toLowerCase();

                        if (addChoice.equals("n") || addChoice.equals("no")) {
                            isAdding = false;
                        }
                    }

                    slotService.addSlotsForGym(gymId, newSlotList);
                    break;
                case 5:
                    System.out.println("Going back to Previous menu");
                    return;
                default:
                    System.out.println("Invalid Option selected");
                    break;
            }
        }
    }
}
