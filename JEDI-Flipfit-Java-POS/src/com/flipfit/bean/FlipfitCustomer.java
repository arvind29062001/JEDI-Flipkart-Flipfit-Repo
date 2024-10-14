package com.flipfit.bean;


/**
 * Represents a customer in the FlipFit system, extending FlipFitUser.
 * Contains customer-specific details such as phone number and card details.
 */

public class FlipFitCustomer extends Person {
    private String phoneNumber;
    private String govId;

    /**
     * Parameterized constructor to initialize customer details.
     * @param id User ID of the customer
     * @param name Username of the customer
     * @param email Email of the customer
     * @param password Password of the customer
     * @param phoneNumber Phone number of the customer
     * @param govId Card details of the customer
     */

    public FlipFitCustomer(String id, String name, String email, String password, String phoneNumber,String govId) {
        super(id, name, email, password, FlipFitRole.CUSTOMER);
        this.phoneNumber = phoneNumber;
        this.govId=govId;
    }

    /**
     * Retrieves the phone number of the customer.
     * @return Customer's phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Sets the phone number of the customer.
     * @param phoneNumber Customer's phone number to set
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * returns govId
     * @return govId
     */
    public String getGovId() {
        return this.govId;
    }

    /**
     * sets govId
     * @param govId
     */
    public void setGovId(String govId) {
        this.govId = govId;
    }
}
