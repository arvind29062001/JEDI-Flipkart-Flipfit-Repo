package com.flipfit.client;

import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.bean.FlipFitGymOwner;
import com.flipfit.bean.FlipFitSlot;
import com.flipfit.business.*;
import static com.flipfit.helper.Helper.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class FlipFitGymOwnerMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final FlipFitGymOwnerInterface gymOwnerService = new FlipFitGymOwnerService();
    private static final FlipFitGymCenterInterface gymCenterService = new FlipFitGymCenterService();
    private static final FlipFitSlotInterface slotService = new FlipFitSlotService();

    /**
     * login gymOwnerLogin
     * @param username,password parameters
     * @return true/false
     * @Author Sanyam Lohan
     */
    public boolean gymOwnerLogin(String username, String password) {
        FlipFitGymOwner gymOwner = gymOwnerService.loginGymOwner(username, password);
        if(gymOwner != null) {
            System.out.println("Gym  owner logged in");
            gymOwnerClientMainPage(gymOwner);
        } else {
            System.out.println("Invalid Credentials! Try again!");
            return false;
        }
        return true;
    }

    public void register() {
        System.out.println("Enter your Username");
        String username = scanner.next();

        System.out.println("Enter your Password");
        String password = scanner.next();

        System.out.println("Enter your Email");
        String email = scanner.next();

        System.out.println("Enter your Gov ID Number");
        String govId = scanner.next();

        gymOwnerService.registerGymOwner(username, password, email, govId);
    }

    /**
     *
     * @param gymOwner gymOwner
     * @Author Sanyam Lohan
     */
    public void gymOwnerClientMainPage(FlipFitGymOwner gymOwner) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentTime.format(myFormat);
        System.out.println("Welcome " + gymOwner.getName() + " !!\nPlease choose from the following options\nLogin TIME: " + currentTime);
        while(true){
            System.out.println(
                    "1. View your Gym Centers\n" +
                    "2. Request to add a new Gym Center\n" +
                    "3. Add Slots to a Gym Center\n" +
                    "4. Go Back to Previous Menu"
            );

            int choice = scanner.nextInt();
            switch (choice){

                case 1:
                    List<FlipFitGymCenter> allGymCentres = gymCenterService.getGymCentersByOwnerId(gymOwner.getId());
                    printGymCenters(allGymCentres);
                    break;


                case 2:

                    System.out.println("Enter Gym center name: ");
                    String gymCentreName = scanner.next();

                    System.out.println("Enter Gym center city: ");
                    String city = scanner.next();

                    System.out.println("Enter Gym center capacity: ");
                    int capacity = scanner.nextInt();

                    System.out.println("Enter price: ");
                    int price = scanner.nextInt();

                    System.out.println(gymOwner.getId() + gymCentreName + city);


                    gymCenterService.addCenter(
                            new FlipFitGymCenter(
                                    UUID.randomUUID().toString(),
                                    gymCentreName,
                                    gymOwner.getId(),
                                    city,
                                    capacity,
                                    price,
                                    false
                            )
                    );
                    System.out.println("Request sent to admin");
                    break;

                case 3:
                    boolean isAdding = true;
                    String centerId = null;

                    List<FlipFitSlot> newSlotList = new ArrayList<>();
                    while (isAdding) {
                        System.out.println("Enter new slot id: ");
                        String slotId = scanner.next();

                        System.out.println("Enter Gym Centre Id: ");
                        centerId = scanner.next();

                        System.out.println("Enter time in 24h format (hh:mm:ss) : ");
                        String time = scanner.next();

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalTime localTime = LocalTime.parse(time, formatter);

                        newSlotList.add(new FlipFitSlot(
                                slotId,
                                centerId,
                                localTime
                        ));

                        System.out.println("Do you want to enter more slots (y/n)?: ");
                        String addChoice = scanner.next();
                        addChoice = addChoice.toLowerCase();

                        if(addChoice.equals("n") || addChoice.equals("no")) {
                            isAdding = false;
                        }
                    }

                    slotService.addSlotsForGym(centerId, newSlotList);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Option selected");
                    break;
            }
        }
    }


}
