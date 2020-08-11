package com.kodilla.good.patterns.challenges.food;

public class Product {

    Contractor contractor;
    String name;
    Double price;

    public Product(Contractor contractor, String name, Double price) {
        this.contractor = contractor;
        this.name = name;
        this.price = price;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
