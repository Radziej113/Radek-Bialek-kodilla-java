package com.kodilla.good.patterns.challenges.flight;

import java.util.Objects;

public class Flight {

    Airport departureAirport;
    Airport arrivalAirport;

    public Flight(Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getDepartureAirport().equals(flight.getDepartureAirport()) &&
                getArrivalAirport().equals(flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport());
    }
}
