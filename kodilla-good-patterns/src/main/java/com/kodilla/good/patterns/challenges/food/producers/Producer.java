package com.kodilla.good.patterns.challenges.food.producers;

import com.kodilla.good.patterns.challenges.food.orders.Order;

public interface Producer {
    boolean process(Order order);
}
