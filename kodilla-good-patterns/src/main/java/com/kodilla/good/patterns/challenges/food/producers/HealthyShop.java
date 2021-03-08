package com.kodilla.good.patterns.challenges.food.producers;

import com.kodilla.good.patterns.challenges.food.orders.Order;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        if (order.getQuantity() > 0) {
            System.out.println("Thank you for your order in HealthyShop!");

            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "HealthyShop.";
    }
}
