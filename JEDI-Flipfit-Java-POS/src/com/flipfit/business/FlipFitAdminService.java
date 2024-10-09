package com.flipfit.business;

import com.flipfit.bean.FlipfitGym;
import com.flipfit.bean.FlipfitGymOwner;

import java.util.List;

public class FlipFitAdminService implements FlipFitAdminInterface {

    @Override
    public void approveGym(String gymId) {
        // Implementation logic here
    }

    @Override
    public void cancelApproval(String gymId) {
        // Implementation logic here
    }

    @Override
    public void editAdminProfile(String gymOwnerId, FlipfitGymOwner updatedProfile) {
        // Implementation logic here
    }

    @Override
    public List<FlipfitGym> viewApprovedGyms() {
        return List.of(); // Return an empty list for now
    }

    @Override
    public List<FlipfitGym> viewPendingGyms() {
        return List.of(); // Return an empty list for now
    }

    @Override
    public List<FlipfitGym> search(String gymId) {
        return List.of(); // Return an empty list for now
    }
}
