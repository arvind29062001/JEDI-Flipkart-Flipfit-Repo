package com.flipfit.client;

import com.flipfit.bean.FlipFitGymCenter;
import com.flipfit.business.FlipFitAdminInterface;
import com.flipfit.business.FlipFitAdminService;
import static com.flipfit.helper.Helper.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class FlipFitAdminMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final FlipFitAdminInterface adminService = new FlipFitAdminService();

    private void handleGymCenterApprovalRequests() {
        System.out.println("Enter the gym Id or enter -1 to exit\n");

        String requestGymCenterId = scanner.next();

        if (requestGymCenterId.equals("-1")) return;

        System.out.println("""
                1. Approve the request
                2. Reject the request""");

        int choice = scanner.nextInt();

        if(choice == 1) {
            adminService.approveGymCenter(requestGymCenterId, true);
            System.out.println("Approved Gym Centre " + requestGymCenterId);
        } else if (choice == 2) {
            adminService.approveGymCenter(requestGymCenterId, false);
            System.out.println("Rejected Gym Centre" + requestGymCenterId);
        } else {
            System.out.println("Invalid choice ");
            return;
        }
    }

    private void handleGymCenterRemoval() {
        System.out.println("Enter the gym Id or enter -1 to exit\n");
        String requestGymCenterId = scanner.next();
        adminService.removeGymCenter(requestGymCenterId);
        System.out.println("Removed Gym Center " + requestGymCenterId);
    }

    public void adminClientMainPage() {
        while(true) {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = currentTime.format(myFormat);
            System.out.println("""
                Welcome ADMIN to FlipFit Application
                 Login Time:\s""" + formattedDate + "\n");

            System.out.println("""
                    1. View pending gym requests
                    2. Approve/Reject gym requests
                    3. Remove gym center
                    4. View all gyms
                    5. Go back to previous menu
                    """);

            String pendingChoice = scanner.next();

            switch (pendingChoice) {
                case "1":
                    List<FlipFitGymCenter> pendingGymCentersList = adminService.getPendingGymCentersList();
                    if (pendingGymCentersList.isEmpty()) {
                        System.out.println("""
                                ===========================================
                                 No pending gym centers found...
                                ===========================================
                                """);
                    } else {
                        printGymCenters(pendingGymCentersList);
                    }
                    break;

                case "2":
                    handleGymCenterApprovalRequests();
                    break;

                case "3":
                    handleGymCenterRemoval();
                    break;

                case "4":
                    List<FlipFitGymCenter> allGymCenters = adminService.getAllGymCentersList();
                    printGymCenters(allGymCenters);
                    break;

                case "5":
                    return;

                default:
                    System.out.println("Invalid choice , try again");
                    break;
            }
        }
    }

    /**
     * @param username,password password
     * @Author Pratik Singh
     */
    public void adminLogin(String username, String password) {
        if(username.equals("Ravi") && password.equals("Teja")) System.out.println(" Successfully logged in as ADMIN...\n");
        else {
            System.out.println("Invalid Credentials!");
            return ;
        }
        adminClientMainPage();
    }
}
