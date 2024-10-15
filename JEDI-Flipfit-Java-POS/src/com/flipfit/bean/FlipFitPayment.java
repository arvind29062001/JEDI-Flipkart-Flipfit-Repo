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
     * @Author Arvind Yadav
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Retrieves the amount paid for the payment.
     * @return Amount paid
     * @Author Arvind Yadav
     */
    public String getAmountPaid() {
        return amountPaid;
    }

    /**
     * Retrieves the booking ID associated with the payment.
     * @return Booking ID
     * @Author Arvind Yadav
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Sets the payment ID.
     * @param paymentId Payment ID to set
     * @Author Arvind Yadav
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Sets the amount paid for the payment.
     * @param amountPaid Amount paid to set
     * @Author Arvind Yadav
     */
    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * Sets the booking ID associated with the payment.
     * @param bookingId Booking ID to set
     * @Author Arvind Yadav
     */
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
