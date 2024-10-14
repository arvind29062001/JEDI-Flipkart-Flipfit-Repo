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
     * @param id User ID of the gym owner
     * @param name Username of the gym owner
     * @param email Email of the gym owner
     * @param password Password of the gym owner
     * @param govId PAN number of the gym owner
     */

    public FlipFitGymOwner(String id, String name, String email, String password, String govId) {
        super(id, name, email, password, FlipFitRole.GYM_OWNER);
        this.govId = govId;
    }

    /**
     *
     * @return govId
     */
    public String getGovId() {
        return this.govId;
    }

    /**
     *
     * @return list of gymCenterIds
     */
    public List<String> getGymCenterIdList() {
        return this.gymCenterIdList;
    }

    /**
     *
     * @param govId
     */
    public void SetGovId(String govId) {
        this.govId = govId;
    }

    /**
     *
     * @param gymCenterIdList
     */
    public void setGymCenterIdList(List<String> gymCenterIdList) {
        this.gymCenterIdList = gymCenterIdList;
    }

    /**
     *
     * @param gymCenterId
     */
    public void addGymCenterId(String gymCenterId) {
        this.gymCenterIdList.add(gymCenterId);
    }
}
