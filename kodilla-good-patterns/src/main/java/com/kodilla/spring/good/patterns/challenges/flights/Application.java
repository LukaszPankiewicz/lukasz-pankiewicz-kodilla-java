package com.kodilla.spring.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.showFlightsFrom("Warszawa");
        flightFinder.showFlightsTo("Warszawa");
        flightFinder.flightsWithStopOver("Warszawa", "Gdansk");
    }

}