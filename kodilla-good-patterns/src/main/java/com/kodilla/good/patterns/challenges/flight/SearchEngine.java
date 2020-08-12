package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;

public class SearchEngine {

    public static void main(String[] args) {
        FlightDatabaseRetriever flightDatabaseRetriever = new FlightDatabaseRetriever();
        HashSet<Flight> flightConnection = flightDatabaseRetriever.retrieve();

        new FlightSearch().searchByDepartureAirport(flightConnection, new Airport("Modlin"));

        new FlightSearch().searchByArrivalAirport(flightConnection, new Airport("Katowice"));

        new FlightSearch().searchViaAirport(flightConnection,
                new Airport("Warszawa"));
    }
}