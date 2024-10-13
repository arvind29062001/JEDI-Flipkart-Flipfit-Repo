package com.flipfit.business;

import com.flipfit.bean.FlipFitGymOwner;

import java.util.List;

public interface FlipFitGymOwnerInterface {

    void registerGymOwner(String username, String password, String email, String govId);

    FlipFitGymOwner loginGymOwner(String name, String password);

    List<FlipFitGymOwner> getAllGymOwners();
}
