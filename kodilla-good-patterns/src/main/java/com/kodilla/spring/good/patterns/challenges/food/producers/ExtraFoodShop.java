package com.kodilla.spring.good.patterns.challenges.food.producers;

import com.kodilla.spring.good.patterns.challenges.food.orders.Order;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(Order order) {

        if (order.getQuantity() > 0) {
            System.out.println("Thank you for your order in ExtraFoodShop!");

            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{}";
    }
}
