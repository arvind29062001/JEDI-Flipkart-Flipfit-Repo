package com.flipfit.business;

public interface FlipFitGymOwnerInterface {
    boolean loginGymOwner(String userName, String password);

    void registerGymOwner(String userName, String userName1, String password, String email, String panNumber, String cardNumber);

    void requestGymOwnerApproval(String gymOwnerId);
}
