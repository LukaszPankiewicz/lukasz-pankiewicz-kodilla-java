package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public List<String> findFlightsFrom(String fromCity) {
        List<String> flightsFrom = Airports.accessToSet().stream()
                .filter(Flight -> Flight.getFlightFrom().equals(fromCity))
                .map(flight -> flight.getFlightTo())
                .collect(Collectors.toList());

        return flightsFrom;
    }

    public void showFlightsFrom(String fromCity) {
        if (findFlightsFrom(fromCity).isEmpty()) {
            System.out.println("There is no flight at this route, please try another connection.");
        } else {
            System.out.println("From: " + fromCity + " you can fly to: " + findFlightsFrom(fromCity) + ".");
        }
    }

    public List<String> findFlightsTo(String toCity) {
        List<String> flightsTo = Airports.accessToSet().stream()
                .filter(Flight -> Flight.getFlightTo().equals(toCity))
                .map(flight -> flight.getFlightFrom())
                .collect(Collectors.toList());

        return flightsTo;
    }

    public void showFlightsTo(String toCity) {
        if (findFlightsTo(toCity).isEmpty()) {
            System.out.println("There is no flight at this route, please try another connection.");
        } else {
            System.out.println("Flight to : " + toCity + " is available from: " + findFlightsTo(toCity));
        }
    }

    public void flightsWithStopOver(String fromCity, String toCity) {

        List<String> flightsFrom = findFlightsFrom(fromCity);
        List<String> flightsTo = findFlightsTo(toCity);

        List<String> stopOver = new ArrayList<>();
        for (String fly : flightsFrom) {
            if (flightsTo.contains(fly)) {
                stopOver.add(fly);
            }
        }
        if (stopOver.isEmpty()) {
            System.out.println("There is not flight at this route, please try another connection.");
        } else {
            System.out.println("From: " + fromCity + " to: " + toCity + " you can fly by " + stopOver + ".");
        }
    }
}
