package com.kodilla.good.patterns.challenges.food;

import java.util.stream.Collectors;

public final class ExtraFoodShop extends Contractor {

    public ExtraFoodShop(final String name) {
        super(name);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        String extraFoodShopString = orderRequest.getOrderMap().entrySet()
                .stream()
                .filter(entry -> entry.getKey().getContractor().toString().equals("ExtraFoodShop"))
                .map(entry -> entry.getKey().getName() + " - " + entry.getValue())
                .collect(Collectors.joining("|"));
    }
}