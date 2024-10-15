package com.flipfit.dao;

import com.flipfit.bean.FlipFitGymOwner;

import java.util.List;

/**
 * Data Access Object (DAO) interface for handling gym owner-related operations in FlipFit system.
 * This interface defines methods for retrieving gym owner details, managing approval requests,
 * and registering gym owners.
 */

public interface FlipFitGymOwnerDAOInterface {
    /**
     * Retrieves a list of all gym owners.
     * @return List of all gym owners
     * @Author Ravi Teja
     */

    List<FlipFitGymOwner> getGymOwnerList();

    /**
     *
     * @param username,password password for user login
     * @return FlipFitGymOwner
     * @Author Ravi Teja
     */
    FlipFitGymOwner loginGymOwner(String username, String password);

    /**
     * Sets the list of gym owners.
     * @param gymOwnerList List of gym owners to set
     * @Author Ravi Teja
     */

    void setGymOwnerList(List<FlipFitGymOwner> gymOwnerList);

    /**
     * Registers a new gym owner.
     * @param gymOwner The FlipFitGymOwner object representing the gym owner to register
     * @Author Ravi Teja
     */
    void registerGymOwner(FlipFitGymOwner gymOwner);
}
