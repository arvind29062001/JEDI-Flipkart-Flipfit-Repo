package com.flipfit.bean;

public class FlipFitCustomer extends Person {
    private String phoneNumber;
    private String govId;

    public FlipFitCustomer(String id, String name, String email, String password, String phoneNumber,String govId) {
        super(id, name, email, password, FlipFitRole.CUSTOMER);
        this.phoneNumber = phoneNumber;
        this.govId=govId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGovId() {
        return this.govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }
}
