package com.flipfit.dao;

import com.flipfit.bean.FlipFitPayment;
import com.flipfit.constant.SQLConstants;
import com.flipfit.helper.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlipFitPaymentDAO implements FlipFitPaymentDAOInterface {

    private Connection conn = null;
    private PreparedStatement statement = null;

    @Override
    public void addPayment(FlipFitPayment payment) {
        try {
            conn = DatabaseConnection.connect();
            statement = conn.prepareStatement(SQLConstants.ADD_NEW_PAYMENT_BY_ID);

            statement.setString(1, payment.getPaymentId());
            statement.setString(2, payment.getAmountPaid());
            statement.setString(3, payment.getBookingId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public FlipFitPayment getPaymentById(String paymentId) {
        FlipFitPayment payment = null;
        try {
            conn = DatabaseConnection.connect();
            statement = conn.prepareStatement(SQLConstants.GET_PAYMENT_BY_ID);
            statement.setString(1, paymentId);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                payment = new FlipFitPayment("1","1","1");
                payment.setPaymentId(rs.getString("paymentId"));
                payment.setAmountPaid(rs.getString("amountPaid"));
                payment.setBookingId(rs.getString("bookingId"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return payment;
    }






}
