package com.flipfit.dao;

import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.exceptions.RegistrationFailedException;
import com.flipfit.exceptions.UserInvalidException;
/**
 * Data Access Object (DAO) interface for handling customer-related operations in FlipFit system.
 * This interface defines methods for registering customers, validating users, and retrieving customer details.
 * @author Ravi Teja
 */

public interface FlipFitCustomerDAOInterface {
    /**
     * Registers a new customer with the provided details.
     * @param name,password,email,phoneNumber,govId Card number of the
     * @throws RegistrationFailedException If registration fails for any reason
     * @author Ravi Teja
     */

    void registerCustomer(String name, String email, String password, String phoneNumber,String govId)throws RegistrationFailedException;

    /**
     * Checks if a user with the given username and password is valid.
     * @param name,password Password of the user
     * @return True if the user is valid, false otherwise
     * @throws UserInvalidException If user validation fails
     * @author Ravi Teja
     */

    boolean isUserValid(String name, String password)throws UserInvalidException;

    /**
     * Retrieves details of a customer based on their username.
     * @param name Username of the customer
     * @return The FlipFitCustomer object
     * @author Ravi Teja
     */

    FlipFitCustomer getCustomerByName(String name);
}