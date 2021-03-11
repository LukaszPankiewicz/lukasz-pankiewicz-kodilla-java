package com.kodilla.spring.good.patterns.challenges.food.orders;


public class Order {

    private String product;
    private double quantity;

    public Order(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProductName() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (Double.compare(order.quantity, quantity) != 0) return false;
        return product != null ? product.equals(order.product) : order.product == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = product != null ? product.hashCode() : 0;
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
