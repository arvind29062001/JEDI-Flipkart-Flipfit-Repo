package com.flipfit.business;

import com.flipfit.bean.FlipFitGymOwner;

import java.util.List;

/**
 * Interface defining operations related to gym owners in the FlipFit system.
 * @author Smarth Bhatt
 */
public interface FlipFitGymOwnerInterface {

    /**
     * Registers a new gym owner with the provided details.
     * @param username,password,email,govId PAN number of the gym owner
     * @author Samarth Bhatt
     */
    void registerGymOwner(String username, String password, String email, String govId);

    /**
     * Validates the login credentials of a gym owner.
     * @param name,password Password of the gym owner
     * @return True if login is successful, false otherwise
     * @author Samarth Bhatt
     */
    FlipFitGymOwner loginGymOwner(String name, String password);

    /**
     * Retrieves details of all registered gym owners.
     * @return List of all gym owners
     * @author Samarth Bhatt
     */
    List<FlipFitGymOwner> getAllGymOwners();
}
