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
     * @param gymCenterId,gymOwnerId,gymCenterName,city,capacity,price,isApproved parameters
     * @Author Arvind Yadav
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
     * @Author Arvind Yadav
     */
    public String getGymCenterId() {
        return this.gymCenterId;
    }

    /**
     * Retrieves the name of the gym center.
     * @return Name of the gym center
     * @Author Arvind Yadav
     */
    public String getGymCenterName() {
        return this.gymCenterName;
    }
    /**
     * Retrieves the ID of the owner of the gym center.
     * @return Owner ID of the gym center
     * @Author Arvind Yadav
     */

    public String getGymOwnerId() {
        return this.gymOwnerId;
    }
    /**
     * Retrieves the city where the gym center is located.
     * @return City of the gym center
     * @Author Arvind Yadav
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Retrieves the maximum capacity of the gym center.
     * @return Capacity of the gym center
     * @Author Arvind Yadav
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Retrieves the price associated with the gym center.
     * @return Price of the gym center
     * @Author Arvind Yadav
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Checks if the gym center is approved.
     * @return True if the gym center is approved, false otherwise
     * @Author Arvind Yadav
     */

    public boolean isApproved() {
        return this.isApproved;
    }

    /**
     * Sets the ID of the gym center.
     * @param gymCenterId ID to set
     * @Author Arvind Yadav
     */
    public void setGymCenterId(String gymCenterId) {
        this.gymCenterId = gymCenterId;
    }

    /**
     * Sets the name of the gym center.
     * @param gymCenterName Name to set
     * @Author Arvind Yadav
     */
    public void setGymCenterName(String gymCenterName) {
        this.gymCenterName = gymCenterName;
    }

    /**
     * Sets the ID of the owner of the gym center.
     * @param gymOwnerId Owner ID to set
     * @Author Arvind Yadav
     */

    public void setGymOwnerId(String gymOwnerId) {
        this.gymOwnerId = gymOwnerId;
    }

    /**
     * Sets the city where the gym center is located.
     * @param city City to set
     * @Author Arvind Yadav
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * sets the capacity of the gym
     * @param capacity Capacity to set
     * @Author Arvind Yadav
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Sets the price associated with the gym center.
     * @param price Price to set
     * @Author Arvind Yadav
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * sets approval status
     * @param isApproved approval status to set
     * @Author Arvind Yadav
     */
    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
}
