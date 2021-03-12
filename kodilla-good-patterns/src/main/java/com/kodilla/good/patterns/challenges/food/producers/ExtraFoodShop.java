package com.kodilla.good.patterns.challenges.food.producers;

import com.kodilla.good.patterns.challenges.food.orders.Order;
import com.kodilla.good.patterns.challenges.food.orders.OrderStatus;
import com.kodilla.good.patterns.challenges.food.orders.Product;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    static Product product = new Product("Watermelon", 1);
    static Product product1 = new Product("Banana", 1);
    static Product product2 = new Product("Apple", 2);
    static Product product3 = new Product("Pear", 3);
    static Product product4 = new Product("Pineapple", 4);

    static Integer qnty = 100;

    static Map<Product, Integer> products = new HashMap<>();

    static {
        products.put(product, qnty);
        products.put(product1, qnty);
        products.put(product2, qnty);
        products.put(product3, qnty);
        products.put(product4, qnty);

    }

    @Override
    public OrderStatus process(Order order) {

        if (order.getQuantity() > 101) {
            System.out.println("We are sorry, you have ordered too many products.");

            return OrderStatus.ORDER_UNAVAILABLE;
        } else {
            return OrderStatus.ORDERED;
        }
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{}";
    }
}
