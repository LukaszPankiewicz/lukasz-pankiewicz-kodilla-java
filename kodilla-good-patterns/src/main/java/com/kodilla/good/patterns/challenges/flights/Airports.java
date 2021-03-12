package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class Airports {

    private static final String WAW = "Warszawa";
    private static final String GDA = "Gdansk";
    private static final String LUB = "Lublin";
    private static final String KTA = "Katowice";
    private static final String WRO = "Wroclaw";
    private static final String OLS = "Olsztyn";
    private static final String LOD = "Lodz";
    private static final String KRK = "Krakow";

    private static Set<Flight> airportSet = new HashSet<>();

    static {
        airportSet.add(new Flight(WAW, GDA));
        airportSet.add(new Flight(WAW, KRK));
        airportSet.add(new Flight(WAW, KTA));
        airportSet.add(new Flight(WAW, WRO));
        airportSet.add(new Flight(WAW, LUB));
        airportSet.add(new Flight(GDA, KRK));
        airportSet.add(new Flight(GDA, KTA));
        airportSet.add(new Flight(GDA, WRO));
        airportSet.add(new Flight(GDA, LUB));
        airportSet.add(new Flight(WRO, KRK));
        airportSet.add(new Flight(WRO, KTA));
        airportSet.add(new Flight(WRO, GDA));
        airportSet.add(new Flight(WRO, LUB));
        airportSet.add(new Flight(OLS, LOD));
        airportSet.add(new Flight(LOD, OLS));
        airportSet.add(new Flight(KTA, GDA));
        airportSet.add(new Flight(KTA, WAW));
    }
    public static Set<Flight> accessToSet() {
        return new HashSet<>(airportSet);
    }

}