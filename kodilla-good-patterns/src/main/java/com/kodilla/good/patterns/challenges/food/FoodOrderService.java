package com.kodilla.good.patterns.challenges.food;

import com.kodilla.good.patterns.challenges.food.orders.Order;
import com.kodilla.good.patterns.challenges.food.producers.Producer;

public class FoodOrderService {

    Producer producer;
    Order order;

    public FoodOrderService(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }
    public void foodOrder(){
        if (producer.process(order)){
            System.out.println("Your ordered products: " + order.getProduct() + ". Quantity: " + order.getQuantity());

        }
    }
}
