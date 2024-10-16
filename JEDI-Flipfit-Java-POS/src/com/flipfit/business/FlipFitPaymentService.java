package com.flipfit.business;

import com.flipfit.bean.FlipFitPayment;
import com.flipfit.dao.FlipFitPaymentDAO;

import java.util.ArrayList;
import java.util.List;

public class FlipFitPaymentService implements FlipFitPaymentInterface {

    private FlipFitPaymentDAO paymentDAO= new FlipFitPaymentDAO();
    @Override
    public FlipFitPayment savePayment(FlipFitPayment payment) {
        paymentDAO.addPayment(payment);
        return payment;
    }

    @Override
    public FlipFitPayment getPaymentById(String paymentId) {
        return paymentDAO.getPaymentById(paymentId);
    }

    @Override
    public List<FlipFitPayment> getAllPayments() {
        return new ArrayList<>();
    }

    @Override
    public void deletePayment(String paymentId) {

    }
}
