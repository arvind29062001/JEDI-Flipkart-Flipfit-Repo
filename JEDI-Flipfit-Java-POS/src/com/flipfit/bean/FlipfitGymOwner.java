package com.flipfit.bean;

import java.util.List;

public class FlipFitGymOwner extends Person {
    private String govId;
    private List<String> gymCenterIdList;

    public FlipFitGymOwner(String id, String name, String email, String password, String govId) {
        super(id, name, email, password, FlipFitRole.GYM_OWNER);
        this.govId = govId;
    }

    public String getGovId() {
        return this.govId;
    }

    public List<String> getGymCenterIdList() {
        return this.gymCenterIdList;
    }

    public void SetGovId(String govId) {
        this.govId = govId;
    }

    public void setGymCenterIdList(List<String> gymCenterIdList) {
        this.gymCenterIdList = gymCenterIdList;
    }

    public void addGymCenterId(String gymCenterId) {
        this.gymCenterIdList.add(gymCenterId);
    }
}
