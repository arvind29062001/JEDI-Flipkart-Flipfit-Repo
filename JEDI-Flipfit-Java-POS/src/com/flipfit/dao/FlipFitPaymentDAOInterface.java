package com.flipfit.dao;

import com.flipfit.bean.FlipFitPayment;

public interface FlipFitPaymentDAOInterface {
    void addPayment(FlipFitPayment payment);
    FlipFitPayment getPaymentById(String paymentId);
    // Other CRUD methods can be defined here
}
