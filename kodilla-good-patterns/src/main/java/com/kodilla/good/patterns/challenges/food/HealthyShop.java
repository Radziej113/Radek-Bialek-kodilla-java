package com.kodilla.good.patterns.challenges.food;

import java.util.ArrayList;
import java.util.List;

public final class HealthyShop extends Contractor {

    public HealthyShop(final String name) {
        super(name);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        List<String> contractorOrder = new ArrayList<String>();
        orderRequest.getOrderMap().entrySet()
                .stream()
                .filter(entry -> entry.getKey().getContractor().toString().equals("HealthyShop"))
                .map(entry -> entry.getKey().getName() + " - " + entry.getValue())
                .forEach(contractorOrder::add);

    }
}