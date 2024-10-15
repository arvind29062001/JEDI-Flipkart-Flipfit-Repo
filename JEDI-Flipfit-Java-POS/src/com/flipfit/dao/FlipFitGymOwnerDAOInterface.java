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
     * @author Ravi Teja
     */

    List<FlipFitGymOwner> getGymOwnerList();

    /**
     *
     * @param username,password password for user login
     * @return FlipFitGymOwner
     * @author Ravi Teja
     */
    FlipFitGymOwner loginGymOwner(String username, String password);

    /**
     * Sets the list of gym owners.
     * @param gymOwnerList List of gym owners to set
     * @author Ravi Teja
     */

    void setGymOwnerList(List<FlipFitGymOwner> gymOwnerList);

    /**
     * Registers a new gym owner.
     * @param gymOwner The FlipFitGymOwner object representing the gym owner to register
     * @author Ravi Teja
     */
    void registerGymOwner(FlipFitGymOwner gymOwner);
}
