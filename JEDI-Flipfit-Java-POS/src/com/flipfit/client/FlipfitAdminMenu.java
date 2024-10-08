package com.flipfit.client;
import java.util.Scanner;

public class FlipfitAdminMenu {
    public Scanner scanner = new Scanner(System.in);
    public boolean adminLogin(String userName, String password) {
        System.out.println("Admin login here");
        return true;
    }

    public void updatePassword(String email,String oldPassword,String newPassword){
        System.out.println("Password updated successfully");
    }

    public void handleGymCentreApprovalRequests(){
        System.out.println("Gym centre approval requests here");

        System.out.println("Press 0 to Exit or Choose the Gym Centre To Modify:");
        String requestGymCenterId = scanner.next();
        if (requestGymCenterId.equals("0")) return;
//            Now Admin will select an request and we will pop up with two
        System.out.println("1. Approve the request\n2. Reject the request\n");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Approved Gym Centre");
        } else if (choice == 2) {
            System.out.println("Rejected Gym Centre Request");
        }
    }

    public void adminClientMainPage(){
        System.out.println("Welcome to Flipfit application :-->");

        while(true){
            System.out.println(
                    "1. view all gym owners\n" +
                            "2. view all gym centres\n" +
                            "3. remove gym centre\n" +
                            "4. view list of pending request to add gym\n" +
                            "5. Go Back to Previous Menu"
            );

            int pendingChoice = scanner.nextInt();
            switch (pendingChoice) {
                case 1:
                    System.out.println("all gym owners displayed");
                    break;
                case 2:
                    System.out.println("all gym centres displayed");
                    break;
                case 3:
                    System.out.println("gym centre removed");
                    break;

                case 4:
                    System.out.println("all pending requests displayed");
                    break;
                case 5:
                    return;
            }
        }
    }
}
