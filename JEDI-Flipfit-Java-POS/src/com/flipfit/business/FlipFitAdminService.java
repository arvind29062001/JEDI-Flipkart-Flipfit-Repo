package com.flipfit.business;

import java.util.List;

public class FlipFitAdminService implements FlipFitAdminInterface {


    @Override
    public void approveGym(String gymCenterId) {

    }

    @Override
    public void cancelApproval(String gymCenterId) {

    }

    @Override
    public void editAdminProfile(String gymAdminId, FlipFitGymOwner updatedProfile) {

    }

    @Override
    public List<FlipFitGymCenter> viewApprovedGymCenters() {
        return Collections.emptyList();
    }

    @Override
    public List<FlipFitGymCenter> viewPendingGymCenters() {
        return Collections.emptyList();
    }

    @Override
    public List<FlipFitGymCenter> search(String gymCenterId) {
        return Collections.emptyList();
    }
}
