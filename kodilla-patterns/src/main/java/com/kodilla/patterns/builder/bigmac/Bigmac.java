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
        private final List<String> ingredients = new ArrayList<>();
        private final List<String> bunTypes = createListOfBuns();
        private final List<String> sauceTypes = createListOfSauces();
        private final List<String> ingredientsTypes = createListOfIngredients();

        private List<String> createListOfBuns() {
            List<String> result = new ArrayList<>();
            result.add(BUN_WITH_SESAME);
            result.add(BUN_WITHOUT_SESAME);
            return result;
        }

        private List<String> createListOfSauces() {
            List<String> result = new ArrayList<>();
            result.add(SAUCE_STANDARD);
            result.add(SAUCE_1000ISLAND);
            result.add(SAUCE_BARBECUE);
            return result;
        }

        private List<String> createListOfIngredients() {
            List<String> result = new ArrayList<>();
            result.add(INGREDIENT_SALAD);
            result.add(INGREDIENT_ONION);
            result.add(INGREDIENT_BACON);
            result.add(INGREDIENT_PRAWNS);
            result.add(INGREDIENT_CHILI);
            result.add(INGREDIENT_CUCUMBER);
            result.add(INGREDIENT_CHEESE);
            result.add(INGREDIENT_MUSHROOMS);
            return result;
        }

        public BigmacBuilder bun(String bun) {

            if (bunTypes.contains(bun)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("There are two possible buns: " + bunTypes);
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers >= 1) {
                this.burgers = burgers;
            } else {
                throw new IllegalStateException("You must order at least 1 burger");
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {

            if (sauceTypes.contains(sauce)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Possible sauces: " + sauceTypes);
            }

            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {

            if (ingredientsTypes.contains(ingredient)) {
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

