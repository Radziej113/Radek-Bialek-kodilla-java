package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapOfFlights = new HashMap<>();

        //SampleData
        mapOfFlights.put("Tokyo", true);
        mapOfFlights.put("Berlin", false);
        mapOfFlights.put("Warsaw", false);
        mapOfFlights.put("Paris", true);
        mapOfFlights.put("Washington D.C.", true);
        mapOfFlights.put("Cairo", true);

        if(mapOfFlights.get(flight.getArrivalAirport()) == null
                || mapOfFlights.get(flight.getDepartureAirport()) == null) {

            throw new RouteNotFoundException("At least one of airports doesn't exist.");
        }

        if(mapOfFlights.get(flight.getArrivalAirport()) && mapOfFlights.get(flight.getDepartureAirport())) {

            System.out.println("We're checking details of this connecting flight, please wait.");

        } else {

            System.out.println("We're very sorry, but this connecting flight is not available.");
        }
    }
}
