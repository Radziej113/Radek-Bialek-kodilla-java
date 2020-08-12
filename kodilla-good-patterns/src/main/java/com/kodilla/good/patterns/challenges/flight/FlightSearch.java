package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    public void searchByDepartureAirport(HashSet<Flight> flightSet, Airport airport) {

        System.out.println("All flights from: " + airport.getName());
        flightSet.stream()
                .filter(flight -> flight.getDepartureAirport().getName().equals(airport.getName()))
                .map(entry -> entry.getDepartureAirport().getName() + " - " + entry.getArrivalAirport().getName())
                .forEach(System.out::println);
    }

    public void searchByArrivalAirport(HashSet<Flight> flightSet, Airport airport) {

        System.out.println("All flights to: " + airport.getName());
        flightSet.stream()
                .filter(flight -> flight.getArrivalAirport().getName().equals(airport.getName()))
                .map(entry -> entry.getDepartureAirport().getName() + " - " + entry.getArrivalAirport().getName())
                .forEach(System.out::println);
    }

    public void searchViaAirport(HashSet<Flight> flightSet, Airport airlineHub) {

        List<String> departureAirport = flightSet.stream()
                .filter(flight -> flight.getArrivalAirport().getName().equals(airlineHub.getName()))
                .map(entry -> entry.getDepartureAirport().getName())
                .collect(Collectors.toList());

        List<String> arrivalAirport = flightSet.stream()
                .filter(flight -> flight.getDepartureAirport().getName().equals(airlineHub.getName()))
                .map(entry -> entry.getArrivalAirport().getName())
                .collect(Collectors.toList());

        if(departureAirport.size() > 1 && arrivalAirport.size() > 1) {

            System.out.println("Flight from:" + "\n" + departureAirport + "\n" +
                    "Flight via: " + "\n" + airlineHub.getName() + "\n" +
                    "Flight to:" + "\n" + arrivalAirport);

        } else {

            System.out.println("Sorry, but " + airlineHub.getName() + " not connecting any others airports.");

        }

    }
}