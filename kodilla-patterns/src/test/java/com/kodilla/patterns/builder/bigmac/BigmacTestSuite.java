package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BUN_WITH_SESAME)
                .ingredient(Bigmac.INGREDIENT_BACON)
                .ingredient(Bigmac.INGREDIENT_CHEESE)
                .ingredient(Bigmac.INGREDIENT_CHILI)
                .ingredient(Bigmac.INGREDIENT_MUSHROOMS)
                .sauce(Bigmac.SAUCE_BARBECUE)
                .burgers(2)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String sauce = bigmac.getSauce();
        String bun = bigmac.getBun();
        String ingredient = bigmac.getIngredients().get(3);

        //Then
        assertEquals(4, howManyIngredients);
        assertEquals("SAUCE_BARBECUE", sauce);
        assertEquals("BUN_WITH_SESAME", bun);
        assertEquals("INGREDIENT_MUSHROOMS", ingredient);

    }
}
