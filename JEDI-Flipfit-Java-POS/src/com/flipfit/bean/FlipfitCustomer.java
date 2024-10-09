package com.flipkart.bean;

/**
 * Represents a customer in the FlipFit system, extending FlipFitUser.
 * Contains customer-specific details such as phone number and card details.
 */
public class FlipFitCustomer extends Person {

    List<Booking>bookings;
    String unique_id_proof;


    public String getUnique_id_proof() {
        return unique_id_proof;
    }

    public void setUnique_id_proof(String unique_id_proof) {
        this.unique_id_proof = unique_id_proof;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }


    /**
     * Default constructor.
     */
    public FlipFitCustomer() {

    }

    public FlipFitCustomer(String userId, String userName, String email, String password, String customerPhone,String unique_id_proof) {
        super(userName,email,customerPhone,userId,password);
        this.unique_id_proof=unique_id_proof;
    }


}