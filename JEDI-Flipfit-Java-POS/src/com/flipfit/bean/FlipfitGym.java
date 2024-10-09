package com.flipfit.bean;

import java.util.List;

public class FlipfitGym {

    private String gymId;
    private int totalSlot;
    private int capacityPerSlot;
    private String location;
    private List<FlipfitGymSlot> slotList;
    private List<FlipfitCustomer> userList;


    //Getter & Setter

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public int getTotalSlot() {
        return totalSlot;
    }

    public void setTotalSlot(int totalSlot) {
        this.totalSlot = totalSlot;
    }

    public int getCapacityPerSlot() {
        return capacityPerSlot;
    }

    public void setCapacityPerSlot(int capacityPerSlot) {
        this.capacityPerSlot = capacityPerSlot;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<FlipfitGymSlot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<FlipfitGymSlot> slotList) {
        this.slotList = slotList;
    }



    public List<FlipfitCustomer> getUserList() {
        return userList;
    }

    public void setUserList(List<FlipfitCustomer> userList) {
        this.userList = userList;
    }


    //Method

    public void viewAvailableSlots(){

    }

    public void getNearestSlot(){


    }



}
