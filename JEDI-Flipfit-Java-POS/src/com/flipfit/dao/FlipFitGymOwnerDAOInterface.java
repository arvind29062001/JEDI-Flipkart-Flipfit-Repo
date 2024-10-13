package com.flipfit.dao;

import com.flipfit.bean.FlipFitGymOwner;

import java.util.List;

public interface FlipFitGymOwnerDAOInterface {
    List<FlipFitGymOwner> getGymOwnerList();

    FlipFitGymOwner loginGymOwner(String username, String password);

    void setGymOwnerList(List<FlipFitGymOwner> gymOwnerList);

    void registerGymOwner(FlipFitGymOwner gymOwner);
}
