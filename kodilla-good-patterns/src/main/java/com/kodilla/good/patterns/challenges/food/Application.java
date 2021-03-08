package com.kodilla.good.patterns.challenges.food;

import com.kodilla.good.patterns.challenges.food.orders.Order;
import com.kodilla.good.patterns.challenges.food.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food.producers.HealthyShop;
import com.kodilla.good.patterns.challenges.food.producers.Producer;

public class Application {

    public static void main(String[] args) {

        Producer extraFoodShop = new ExtraFoodShop();
        Producer glutenFreeShop = new GlutenFreeShop();
        Producer healthyShop = new HealthyShop();

        Order order = new Order(extraFoodShop, "Apple", 50.0);
        Order order1 = new Order(glutenFreeShop, "Pear", 100.0);
        Order order2 = new Order(healthyShop, "Banana", 150.0);

        FoodOrderService foodOrderService = new FoodOrderService(extraFoodShop, order);
        FoodOrderService foodOrderService1 = new FoodOrderService(glutenFreeShop, order1);
        FoodOrderService foodOrderService2 = new FoodOrderService(healthyShop, order2);

        foodOrderService.foodOrder();
        foodOrderService1.foodOrder();
        foodOrderService2.foodOrder();


    }
}
