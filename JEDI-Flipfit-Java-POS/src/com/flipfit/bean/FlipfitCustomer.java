package com.flipfit.bean;

public class FlipfitCustomer extends Person {

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

    public FlipfitCustomer() {

    }

    public FlipfitCustomer(String userId, String userName, String email, String password, String customerPhone,String unique_id_proof) {
        super(userName,email,customerPhone,userId,password);
        this.unique_id_proof=unique_id_proof;
    }
}
