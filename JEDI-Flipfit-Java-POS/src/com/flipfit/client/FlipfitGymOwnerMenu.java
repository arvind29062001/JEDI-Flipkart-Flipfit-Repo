package com.flipfit.client;

public class FlipfitGymOwnerMenu {
    public void gymOwnerRegister(){
        System.out.println("Gym Owner Register here");
    }

    public boolean gymOwnerLogin(String username, String password){
        System.out.println("Gym Owner Login");
        return true;
    }


    public void gymOwnerRegister(String userName, String name, String password,String mobno,String Address,String idProof) {
        System.out.println("Gym owner Successfully Registered ");
    }


    public void updatePassword(String email,String oldPassword,String newPassword){
        System.out.println("Password updated successfully");
    }
    public void gymOwnerClientMainPage(String gymOwnerId){
        System.out.println("Gym Owner Client Main Page");

        System.out.println(
                "1. Send Gym Approval Request to Admin\n" +
                "2. Remove Gym\n" +
                "3. Add/change no of Slots to a Gym Centre\n" +
                "4. Display Bookings\n" +
                "5. Go Back to Previous Menu"
        );
    }
}
