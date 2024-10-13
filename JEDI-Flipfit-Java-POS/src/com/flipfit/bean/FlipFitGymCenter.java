package com.flipfit.bean;

public class FlipFitGymCenter {
    private String gymCenterId;
    private String gymCenterName;
    private String gymOwnerId;
    private String city;
    private int capacity;
    private int price;

    @Override
    public String toString() {
        return "FlipFitGymCenter{" +
                "gymCenterId='" + gymCenterId + '\'' +
                ", gymCenterName='" + gymCenterName + '\'' +
                ", gymOwnerId='" + gymOwnerId + '\'' +
                ", city='" + city + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", isApproved=" + isApproved +
                '}';
    }

    private boolean isApproved;

    public FlipFitGymCenter() {}

    public FlipFitGymCenter(String gymCenterId, String gymCenterName, String gymOwnerId, String city, int capacity, int price, boolean isApproved) {
        this.gymCenterId = gymCenterId;
        this.gymCenterName = gymCenterName;
        this.gymOwnerId = gymOwnerId;
        this.city = city;
        this.capacity = capacity;
        this.price = price;
        this.isApproved = isApproved;
    }

    public String getGymCenterId() {
        return this.gymCenterId;
    }

    public String getGymCenterName() {
        return this.gymCenterName;
    }

    public String getGymOwnerId() {
        return this.gymOwnerId;
    }

    public String getCity() {
        return this.city;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isApproved() {
        return this.isApproved;
    }

    public void setGymCenterId(String gymCenterId) {
        this.gymCenterId = gymCenterId;
    }

    public void setGymCenterName(String gymCenterName) {
        this.gymCenterName = gymCenterName;
    }

    public void setGymOwnerId(String gymOwnerId) {
        this.gymOwnerId = gymOwnerId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
}
