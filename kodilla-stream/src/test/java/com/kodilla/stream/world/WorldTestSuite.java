package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country france = new Country("France", new BigDecimal("60000000"));
        Country slovakia = new Country("Slovakia", new BigDecimal("8000000"));
        Country china = new Country("China", new BigDecimal("1300000000"));
        Country japan = new Country("Japan", new BigDecimal("120000000"));
        Country vietnam = new Country("Vietnam", new BigDecimal("100000000"));
        Country thailand = new Country("Thailand", new BigDecimal("65000000"));
        Country egypt = new Country("Egypt", new BigDecimal("80000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("165000000"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("80000000"));
        Country kenya = new Country("Kenya", new BigDecimal("39000000"));
        Country brazil = new Country("Brazil", new BigDecimal("210000000"));
        Country colombia = new Country("Colombia", new BigDecimal("49000000"));
        Country argentina = new Country("Argentina", new BigDecimal("43000000"));
        Country venezuela = new Country("Venezuela", new BigDecimal("28000000"));

        Set<Country> countriesOfEurope = new HashSet<>();
        countriesOfEurope.add(poland);
        countriesOfEurope.add(germany);
        countriesOfEurope.add(france);
        countriesOfEurope.add(slovakia);

        Set<Country> countriesOfAsia = new HashSet<>();
        countriesOfEurope.add(china);
        countriesOfEurope.add(japan);
        countriesOfEurope.add(thailand);
        countriesOfEurope.add(vietnam);

        Set<Country> countriesOfAfrica = new HashSet<>();
        countriesOfEurope.add(egypt);
        countriesOfEurope.add(nigeria);
        countriesOfEurope.add(ethiopia);
        countriesOfEurope.add(kenya);

        Set<Country> countriesOfSouthAmerica = new HashSet<>();
        countriesOfEurope.add(brazil);
        countriesOfEurope.add(colombia);
        countriesOfEurope.add(argentina);
        countriesOfEurope.add(venezuela);

        Set<Continent> continents = new HashSet<>();
        continents.add(new Continent("Europe", countriesOfEurope));
        continents.add(new Continent("Asia", countriesOfAsia));
        continents.add(new Continent("Africa", countriesOfAfrica));
        continents.add(new Continent("SouthAmerica", countriesOfSouthAmerica));

        World world = new World(continents);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2465000000");
        Assert.assertEquals(expectedPeopleQuantity, result);
    }
}
