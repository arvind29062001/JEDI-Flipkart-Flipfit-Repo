package com.flipfit.business;

import com.flipkart.bean.FlipFitGymCenter;
import com.flipkart.bean.FlipFitGymOwner;

import java.util.List;

public interface FlipFitAdminInterface {

    // Approve a gym
    void approveGym(String gymCenterId);

    // Cancel approval of a gym
    void cancelApproval(String gymCenterId);

    // Edit a gym owner's profile
    void editAdminProfile(String gymAdminId, FlipFitGymOwner updatedProfile);

    // View approved gym centers
    List<FlipFitGymCenter> viewApprovedGymCenters();

    // View pending gym centers
    List<FlipFitGymCenter> viewPendingGymCenters();

    // Search for gyms by gymId or other criteria
    List<FlipFitGymCenter> search(String gymCenterId);
}
