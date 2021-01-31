package com.kodilla.exception.test;

import java.io.IOException;

public class FlightMain {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Radom");
        Flight secondFlight = new Flight("Olsztyn", "Szczecin");
        Flight thirdFlight = new Flight("Moscow", "Rome");

        try {
            flightFinder.findFlight(flight);
            flightFinder.findFlight(secondFlight);
            flightFinder.findFlight(thirdFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight is not available");
        }
    }
}
