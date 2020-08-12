package com.kodilla.good.patterns.challenges.flight;

import java.util.Objects;

public class Airport {

    String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return getName().equals(airport.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
