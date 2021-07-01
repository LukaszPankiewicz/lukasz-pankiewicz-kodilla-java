package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), calculatedPrice);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        assertEquals("Pizza with tomato sauce", ingredients);
    }

    @Test
    public void testPizzaOrderWithAllIngredients() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamOrder(theOrder);
        theOrder = new ExtraMushroomsOrder(theOrder);
        theOrder = new ExtraCheeseOrder(theOrder);

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(25), calculatedPrice);
    }

    @Test
    public void testPizzaOrderWithDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamOrder(theOrder);
        theOrder = new ExtraMushroomsOrder(theOrder);
        theOrder = new ExtraCheeseOrder(theOrder);

        //When
        String allIngredients = theOrder.getIngredients();

        //Then
        assertEquals("Pizza with tomato sauce + ham + mushroom's + extra cheese", allIngredients);

    }
}
