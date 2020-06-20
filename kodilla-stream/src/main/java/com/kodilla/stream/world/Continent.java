package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> collectionOfCountries;

    public Continent(final String continentName, final Set<Country> collectionOfCountries) {
        this.continentName = continentName;
        this.collectionOfCountries = collectionOfCountries;
    }

    public Set<Country> getCountry() {
        return collectionOfCountries;
    }
}
