package com.kodilla.good.patterns.challenges.food;

public final class GlutenFreeShop extends Contractor {

    public GlutenFreeShop(final String name) {
        super(name);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        orderRequest.getOrderMap().entrySet()
                .stream()
                .filter(entry -> entry.getKey().getContractor().toString().equals("GlutenFreeShop"))
                .forEach(System.out::println);
    }
}