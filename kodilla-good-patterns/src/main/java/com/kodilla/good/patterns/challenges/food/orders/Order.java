package com.kodilla.good.patterns.challenges.food.orders;

import com.kodilla.good.patterns.challenges.food.producers.Producer;

public class Order {

    private Producer companyName;
    private String productName;
    private double quantity;

    public Order(Producer companyName, String productName, double quantity) {
        this.companyName = companyName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public Producer getCompanyName() {
        return companyName;
    }

    public String getProductName() {
        return productName;
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
        if (companyName != null ? !companyName.equals(order.companyName) : order.companyName != null)
            return false;
        return productName != null ? productName.equals(order.productName) : order.productName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = companyName != null ? companyName.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
