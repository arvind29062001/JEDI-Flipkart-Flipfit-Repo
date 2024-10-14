package com.flipfit.bean;
/**
 * Represents a gym center in the FlipFit system.
 */
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
    /**
     * Parameterized constructor to initialize gym center details.
     * @param gymCenterId ID of the gym center
     * @param gymOwnerId ID of the owner of the gym center
     * @param gymCenterName Name of the gym center
     * @param city City where the gym center is located
     * @param capacity Maximum capacity of the gym center
     * @param price Price associated with the gym center
     * @param isApproved Approval status of the gym center
     */

    public FlipFitGymCenter(String gymCenterId, String gymCenterName, String gymOwnerId, String city, int capacity, int price, boolean isApproved) {
        this.gymCenterId = gymCenterId;
        this.gymCenterName = gymCenterName;
        this.gymOwnerId = gymOwnerId;
        this.city = city;
        this.capacity = capacity;
        this.price = price;
        this.isApproved = isApproved;
    }
    /**
     * Retrieves the ID of the gym center.
     * @return ID of the gym center
     */
    public String getGymCenterId() {
        return this.gymCenterId;
    }

    /**
     * Retrieves the name of the gym center.
     * @return Name of the gym center
     */
    public String getGymCenterName() {
        return this.gymCenterName;
    }
    /**
     * Retrieves the ID of the owner of the gym center.
     * @return Owner ID of the gym center
     */

    public String getGymOwnerId() {
        return this.gymOwnerId;
    }
    /**
     * Retrieves the city where the gym center is located.
     * @return City of the gym center
     */
    public String getCity() {
        return this.city;
    }

    /**
     *
     * @return capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     *
     * @return price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     *
     * @return True/False
     */
    public boolean isApproved() {
        return this.isApproved;
    }

    /**
     *
     * @param gymCenterId
     * @return gymCenterId
     */
    public void setGymCenterId(String gymCenterId) {
        this.gymCenterId = gymCenterId;
    }

    /**
     *
     * @param gymCenterName
     */
    public void setGymCenterName(String gymCenterName) {
        this.gymCenterName = gymCenterName;
    }

    /**
     *
     * @param gymOwnerId
     */
    public void setGymOwnerId(String gymOwnerId) {
        this.gymOwnerId = gymOwnerId;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @param isApproved
     */
    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
}
