package com.kodilla.spring.good.patterns.challenges.product;

import java.time.LocalDate;

public class ProductOrderRepo implements OrderRepo {
    @Override
    public boolean createOrder(User user, LocalDate orderDate) {
        return true;
    }
}
