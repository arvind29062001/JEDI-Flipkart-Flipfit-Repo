package com.flipfit.business;

import com.flipfit.bean.FlipFitPayment;

import java.util.List;

/**
 * @author Arvind Yadav
 */
public interface FlipFitPaymentInterface {

    /**
     * Saves a new payment.
     * @param payment Payment to save
     * @return Saved payment
     */
    FlipFitPayment savePayment(FlipFitPayment payment);

    /**
     * Retrieves a payment by its ID.
     * @param paymentId Payment ID to retrieve
     * @return Retrieved payment
     */
    FlipFitPayment getPaymentById(String paymentId);

    /**
     * Retrieves all payments.
     * @return List of all payments
     */
    List<FlipFitPayment> getAllPayments();

    /**
     * Deletes a payment by its ID.
     * @param paymentId Payment ID to delete
     */
    void deletePayment(String paymentId);
}
