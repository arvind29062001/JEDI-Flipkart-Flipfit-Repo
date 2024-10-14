package com.flipfit.bean;
/**
 * Represents a payment in the FlipFit system.
 * Each payment is associated with a booking and contains details such as payment ID and amount paid.
 */

public class FlipFitPayment {
    private String paymentId;
    private String amountPaid;
    private String bookingId;

    /**
     * Retrieves the payment ID.
     * @return Payment ID
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     *
     * @return amount paid
     */
    public String getAmountPaid() {
        return amountPaid;
    }

    /**
     *
     * @return BookingId
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     *
     * @param paymentId
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     *
     * @param amountPaid
     */
    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     *
     * @param bookingId
     */
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
