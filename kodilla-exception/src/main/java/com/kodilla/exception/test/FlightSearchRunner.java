package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String args[]) {

        FlightSearcher flightSearcher = new FlightSearcher();

        try {

        Flight tokyoParis = new Flight("Tokyo", "Paris");
        Flight cairoWarsaw = new Flight("Cairo", "Warsaw");
        Flight warsawPrague = new Flight("Warsaw", "Prague");

            flightSearcher.findFlight(tokyoParis);
            flightSearcher.findFlight(cairoWarsaw);
            flightSearcher.findFlight(warsawPrague);

        } catch (RouteNotFoundException e) {

            System.out.println("Sorry, but at least one airport is not available");

        }
    }
}
