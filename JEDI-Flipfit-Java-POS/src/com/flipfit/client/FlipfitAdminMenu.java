package com.flipfit.client;

public class FlipfitAdminMenu {
    public boolean adminLogin(String userName, String password) {
        System.out.println("Admin login here");
        return true;
    }

    public void updatePassword(String email,String oldPassword,String newPassword){
        System.out.println("Password updated successfully");
    }

    public void handleGymCentreApprovalRequests(){
        System.out.println("Gym centre approval requests here");
    }

    public void adminClientMainPage(){
        System.out.println("Welcome to Flipfit application :-->");

        System.out.println(
                "1. view all gym owners\n" +
                "2. view all gym centres\n" +
                "3. remove gym centre\n" +
                "4. view list of pending request to add gym\n" +
                "5. Go Back to Previous Menu"
        );
    }
}
