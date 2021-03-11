package com.kodilla.spring.good.patterns.challenges.product;

import java.time.LocalDate;

public interface OrderRepo {
    boolean createOrder(User user, LocalDate orderDate);
}
