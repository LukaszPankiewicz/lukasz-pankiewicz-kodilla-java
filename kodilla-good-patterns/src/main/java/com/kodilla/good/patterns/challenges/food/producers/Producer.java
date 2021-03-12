package com.kodilla.good.patterns.challenges.food.producers;

import com.kodilla.good.patterns.challenges.food.orders.Order;
import com.kodilla.good.patterns.challenges.food.orders.OrderStatus;

public interface Producer {
    OrderStatus process(Order order);
}
