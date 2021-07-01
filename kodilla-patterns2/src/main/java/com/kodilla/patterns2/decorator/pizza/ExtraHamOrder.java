package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraHamOrder extends AbstractPizzaOrderDecorator {
    public  ExtraHamOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + ham";
    }
}
