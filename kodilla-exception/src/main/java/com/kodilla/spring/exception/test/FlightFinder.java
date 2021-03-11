package com.kodilla.spring.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    void findFlight (Flight flight) throws RouteNotFoundException {
        Map <String, Boolean> availablePort = new HashMap<>();
        availablePort.put("Warsaw", true);
        availablePort.put("Radom", false);
        availablePort.put("Olsztyn", true);
        availablePort.put("Katowice", false);
        availablePort.put("Szczecin", true);
        availablePort.put("Krakow", false);

        if (availablePort.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight to: " + flight.getArrivalAirport() + " is available");
        } else {
            throw new RouteNotFoundException("Flight is not available");
        }
    }
}
