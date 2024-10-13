package com.flipfit.bean;

public class FlipFitPayment {
    private String paymentId;
    private String amountPaid;
    private String bookingId;

    public String getPaymentId() {
        return paymentId;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
