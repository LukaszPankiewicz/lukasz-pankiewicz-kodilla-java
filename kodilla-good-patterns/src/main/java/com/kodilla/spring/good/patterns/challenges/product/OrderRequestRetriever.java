package com.kodilla.spring.good.patterns.challenges.product;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("ZXC", "cxz");
        Product product = new Product("Table", 100.00);

        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(user, orderDate);
    }
}
