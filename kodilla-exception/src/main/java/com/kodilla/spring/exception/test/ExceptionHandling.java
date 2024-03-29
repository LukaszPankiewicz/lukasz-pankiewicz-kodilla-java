package com.kodilla.spring.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = null;

        try {
            result = secondChallenge.probablyIWillThrowException(10, 1);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("End.");
        }
    }
}

