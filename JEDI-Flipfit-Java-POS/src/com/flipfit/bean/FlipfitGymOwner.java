package com.flipfit.bean;

import java.util.List;
/**
 * Represents a gym owner in the FlipFit system, extending Person.
 * Contains owner-specific details such as PAN number, associated gym center IDs,
 * card details, and approval status.
 */

public class FlipFitGymOwner extends Person {
    private String govId;
    private List<String> gymCenterIdList;
    /**
     * Parameterized constructor to initialize gym owner details.
     * @param id,name,email,password,govId parameters
     * @Author Arvind Yadav
     */

    public FlipFitGymOwner(String id, String name, String email, String password, String govId) {
        super(id, name, email, password, FlipFitRole.GYM_OWNER);
        this.govId = govId;
    }

    /**
     * Retrieves the govId of the gym owner.
     * @return govId of the gym owner
     * @Author Arvind Yadav
     */

    public String getGovId() {
        return this.govId;
    }

    /**
     * Retrieves the list of gym center IDs associated with the gym owner.
     * @return List of gym center IDs
     * @Author Arvind Yadav
     */

    public List<String> getGymCenterIdList() {
        return this.gymCenterIdList;
    }


    /**
     * Sets the govId of the gym owner.
     * @param govId govId to set
     * @Author Arvind Yadav
     */
    public void SetGovId(String govId) {
        this.govId = govId;
    }

    /**
     * Sets the list of gym center IDs associated with the gym owner.
     * @param gymCenterIdList List of gym center IDs to set
     * @Author Arvind Yadav
     */
    public void setGymCenterIdList(List<String> gymCenterIdList) {
        this.gymCenterIdList = gymCenterIdList;
    }

    /**
     * Adds a gym center ID to the list associated with the gym owner.
     * @param gymCenterId Gym center ID to add
     * @Author Arvind Yadav
     */
    public void addGymCenterId(String gymCenterId) {
        this.gymCenterIdList.add(gymCenterId);
    }
}
