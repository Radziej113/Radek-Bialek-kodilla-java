package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Adam", "Smith");

        HashMap<Product, Integer> orderMap = new HashMap<>();
        orderMap.put(new Product(new ExtraFoodShop("ExtraFoodShop"), "Extra hot ketchup", 3.99), 3);
        orderMap.put(new Product(new ExtraFoodShop("ExtraFoodShop"), "Extra tasty ice-cream", 2.00), 1);
        orderMap.put(new Product(new ExtraFoodShop("ExtraFoodShop"), "Extra Strong tea", 1.99), 2);
        orderMap.put(new Product(new HealthyShop("HealthyShop"), "Healthy chocolate bar", 0.99), 10);
        orderMap.put(new Product(new HealthyShop("HealthyShop"), "Healthy chocolate", 4.00), 5);
        orderMap.put(new Product(new HealthyShop("HealthyShop"), "Healthy bubblegum", 0.51), 12);
        orderMap.put(new Product(new GlutenFreeShop("GlutenFreeShop"), "Gluten-free bread", 6.00), 1);
        orderMap.put(new Product(new GlutenFreeShop("GlutenFreeShop"), "Gluten-free water", 2.59), 3);
        orderMap.put(new Product(new GlutenFreeShop("GlutenFreeShop"), "Gluten-free book", 40.99), 1);

        return new OrderRequest(user, orderMap);
    }
}
