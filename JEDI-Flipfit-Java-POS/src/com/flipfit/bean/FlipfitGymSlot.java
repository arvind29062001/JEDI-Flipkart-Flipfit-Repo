package com.flipfit.bean;

import java.util.List;

public class FlipfitGymSlot {

    private String gymId;
    private String bookingDate;
    private String startTime;
    private List<FlipfitCustomer> userList;
    private List<FlipfitCustomer> waitingList;


    //Getter & Setter

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<FlipfitCustomer> getUserList() {
        return userList;
    }

    public void setUserList(List<FlipfitCustomer> userList) {
        this.userList = userList;
    }

    public List<FlipfitCustomer> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(List<FlipfitCustomer> waitingList) {
        this.waitingList = waitingList;
    }



//   //Method
//
//    public void bookSlot(){
//
//    }
//
//    public void cancelSlot(){
//
//    }


}
