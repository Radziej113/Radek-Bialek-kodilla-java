package com.kodilla.good.patterns.challenges.food;

public final class ContractorProcessor {

    public void process(OrderRequest orderRequest) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        extraFoodShop.process(orderRequest);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");
        glutenFreeShop.process(orderRequest);

        HealthyShop healthyShop = new HealthyShop("HealthyShop");
        healthyShop.process(orderRequest);
    }
}
