package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;

public class FlightDatabaseRetriever {

    public HashSet<Flight> retrieve() {

        HashSet<Flight> flightSet = new HashSet<>();

        Airport warszawa = new Airport("Warszawa");
        Airport katowice = new Airport("Katowice");
        Airport gdansk = new Airport("Gdańsk");
        Airport wroclaw = new Airport("Wrocław");
        Airport krakow = new Airport("Kraków");
        Airport radom = new Airport("Radom");
        Airport modlin = new Airport("Modlin");
        Airport poznan = new Airport("Poznań");
        Airport lublin = new Airport("Lublin");

        flightSet.add(new Flight(warszawa, katowice));
        flightSet.add(new Flight(katowice, warszawa));
        flightSet.add(new Flight(warszawa, gdansk));
        flightSet.add(new Flight(gdansk, warszawa));
        flightSet.add(new Flight(warszawa, wroclaw));
        flightSet.add(new Flight(warszawa, krakow));
        flightSet.add(new Flight(krakow, warszawa));
        flightSet.add(new Flight(modlin, katowice));
        flightSet.add(new Flight(katowice, modlin));
        flightSet.add(new Flight(warszawa, poznan));
        flightSet.add(new Flight(poznan, warszawa));
        flightSet.add(new Flight(lublin, warszawa));
        flightSet.add(new Flight(krakow, gdansk));
        flightSet.add(new Flight(gdansk, krakow));
        flightSet.add(new Flight(katowice, radom));
        flightSet.add(new Flight(radom, katowice));
        flightSet.add(new Flight(lublin, radom));
        flightSet.add(new Flight(radom, lublin));
        flightSet.add(new Flight(katowice, gdansk));
        flightSet.add(new Flight(gdansk, katowice));
        flightSet.add(new Flight(lublin, gdansk));

        return flightSet;
    }
}
