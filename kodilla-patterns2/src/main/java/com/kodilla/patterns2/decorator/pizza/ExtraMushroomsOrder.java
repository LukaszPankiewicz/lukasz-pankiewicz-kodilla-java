package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraMushroomsOrder extends AbstractPizzaOrderDecorator {
    public ExtraMushroomsOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + mushroom's";
    }
}