package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class PriceCalculator {

    public double calculatePrice(HashMap<Product, Integer> orderMap) {
        double totalPrice = orderMap.entrySet()
                .stream()
                .map(entry -> entry.getKey().getPrice() * entry.getValue())
                .reduce(0.0, (sum, current) -> sum = sum + current);

        return totalPrice;
    }
}
