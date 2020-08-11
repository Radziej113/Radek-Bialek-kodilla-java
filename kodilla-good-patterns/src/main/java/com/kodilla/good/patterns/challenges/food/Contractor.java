package com.kodilla.good.patterns.challenges.food;

abstract class Contractor {

    final String name;

    protected Contractor(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    abstract public void process(OrderRequest orderRequest);
}
