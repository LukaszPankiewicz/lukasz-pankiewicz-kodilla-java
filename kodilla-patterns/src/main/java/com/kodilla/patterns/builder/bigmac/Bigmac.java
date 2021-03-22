package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    public final String bun;
    public final int burgers;
    public final String sauce;
    private List<String> ingredients = new ArrayList<>();
    public final static String BUN_WITH_SESAME = "BUN_WITH_SESAME";
    public final static String BUN_WITHOUT_SESAME = "BUN_WITHOUT_SESAME";
    public final static String SAUCE_STANDARD = "SAUCE_STANDARD";
    public final static String SAUCE_1000ISLAND = "SAUCE_1000ISLAND";
    public final static String SAUCE_BARBECUE = "SAUCE_BARBECUE";
    public final static String INGREDIENT_SALAD = "INGREDIENT_SALAD";
    public final static String INGREDIENT_ONION = "INGREDIENT_ONION";
    public final static String INGREDIENT_CHEESE = "INGREDIENT_CHEESE";
    public final static String INGREDIENT_BACON = "INGREDIENT_BACON";
    public final static String INGREDIENT_CUCUMBER = "INGREDIENT_CUCUMBER";
    public final static String INGREDIENT_MUSHROOMS = "INGREDIENT_MUSHROOMS";
    public final static String INGREDIENT_PRAWNS = "INGREDIENT_PRAWNS";
    public final static String INGREDIENT_CHILI = "INGREDIENT_CHILI";

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private List<String> bunTypes = new ArrayList<>();
        private List<String> sauceTypes = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            bunTypes.add(BUN_WITH_SESAME);
            bunTypes.add(BUN_WITHOUT_SESAME);

            if (bunTypes.contains(bun)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("There are two possible buns: " + bunTypes);
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers >= 0) {
                this.burgers = burgers;
            } else {
                throw new IllegalStateException("You must order at least 1 burger");
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            sauceTypes.add(SAUCE_STANDARD);
            sauceTypes.add(SAUCE_1000ISLAND);
            sauceTypes.add(SAUCE_BARBECUE);

            if (sauceTypes.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Possible sauces: " + sauceTypes);
            }

            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(INGREDIENT_SALAD);
            ingredients.add(INGREDIENT_ONION);
            ingredients.add(INGREDIENT_CHEESE);
            ingredients.add(INGREDIENT_BACON);
            ingredients.add(INGREDIENT_CUCUMBER);
            ingredients.add(INGREDIENT_MUSHROOMS);
            ingredients.add(INGREDIENT_PRAWNS);
            ingredients.add(INGREDIENT_CHILI);

            if (ingredients.contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Available ingredients: " + ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

