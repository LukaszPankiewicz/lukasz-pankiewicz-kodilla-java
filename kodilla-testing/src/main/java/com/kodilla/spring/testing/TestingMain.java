package com.kodilla.spring.testing;

import com.kodilla.spring.testing.calculator.Calculator;
import com.kodilla.spring.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Error");
        }

        Calculator calculator = new Calculator();

        System.out.println("Checking if a + b = 10");

        int addResult = calculator.add(5, 5);
        if (addResult == 10) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Test Error");
        }

        System.out.println("Checking if a - b = 0");

        int substractResult = calculator.substract(5, 5);
        if (substractResult == 0) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Test Error");
        }

    }
}
