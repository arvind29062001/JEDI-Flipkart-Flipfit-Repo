package com.flipfit.business;

import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymOwner;

import java.util.List;

public interface FlipFitAdminInterface {

    // Approve a gym
    void approveGym(String gymId);

    // Cancel approval of a gym
    void cancelApproval(String gymId);

    // Edit a gym owner's profile
    void editAdminProfile(String gymOwnerId, FlipfitGymOwner updatedProfile);

    // View approved gym centers
    List<FlipfitGym> viewApprovedGyms();

    // View pending gym centers
    List<FlipfitGym> viewPendingGyms();

    // Search for gyms by gymId or other criteria
    List<FlipfitGym> search(String gymId);
}
