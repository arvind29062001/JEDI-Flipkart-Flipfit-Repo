package com.flipfit.dao;

import com.flipfit.bean.FlipFitCustomer;

public interface FlipFitCustomerDAOInterface {

    void registerCustomer(String name, String email, String password, String phoneNumber);

    boolean isUserValid(String name, String password);

    FlipFitCustomer getCustomerByName(String name);
}