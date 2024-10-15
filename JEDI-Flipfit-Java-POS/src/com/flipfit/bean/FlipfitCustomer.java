package com.flipfit.bean;


/**
 * Represents a customer in the FlipFit system, extending FlipFitUser.
 * Contains customer-specific details such as phone number and card details.
 * @author Arvind Yadav
 */

public class FlipFitCustomer extends Person {
    private String phoneNumber;
    private String govId;

    /**
     * Parameterized constructor to initialize customer details.
     * @param id,name,email,password,phoneNumber,govId parameters
     * @author Arvind Yadav
     */

    public FlipFitCustomer(String id, String name, String email, String password, String phoneNumber,String govId) {
        super(id, name, email, password, FlipFitRole.CUSTOMER);
        this.phoneNumber = phoneNumber;
        this.govId=govId;
    }

    /**
     * Retrieves the phone number of the customer.
     * @return Customer's phone number
     * @author Arvind Yadav
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Sets the phone number of the customer.
     * @param phoneNumber Customer's phone number to set
     * @author Arvind Yadav
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * returns govId
     * @return govId
     * @author Arvind Yadav
     */
    public String getGovId() {
        return this.govId;
    }

    /**
     * sets govId
     * @param govId
     * @author Arvind Yadav
     */
    public void setGovId(String govId) {
        this.govId = govId;
    }
}
