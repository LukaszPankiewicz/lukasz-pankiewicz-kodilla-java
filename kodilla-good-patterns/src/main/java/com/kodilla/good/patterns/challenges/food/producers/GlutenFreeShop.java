package com.kodilla.good.patterns.challenges.food.producers;

import com.kodilla.good.patterns.challenges.food.orders.Order;
import com.kodilla.good.patterns.challenges.food.orders.OrderStatus;

public class GlutenFreeShop implements Producer {
    @Override
    public OrderStatus process(Order order) {
        if (order.getQuantity() > 1) {
            System.out.println("Thank you for your order in GlutenFreeShop");

            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "GlutenFreeShop.";
    }
}
