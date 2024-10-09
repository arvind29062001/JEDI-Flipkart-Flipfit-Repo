package com.flipfit.business;

public class FlipFitGymOwnerService implements  FlipFitGymOwnerInterface{
    @Override
    public boolean loginGymOwner(String userName, String password){
        System.out.println("Gym owner login");
        return  true;
    }

    @Override
    public void registerGymOwner(String userName, String userName1, String password, String email, String panNumber, String cardNumber) {
        System.out.println("Gym owner registration");
    }
    @Override
    public void requestGymOwnerApproval(String gymOwnerId) {
        System.out.println("Admin approving request of gym owner");
    }

}
