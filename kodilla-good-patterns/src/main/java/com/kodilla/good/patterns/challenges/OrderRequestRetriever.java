package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Wick");

        HashMap<Product, Integer> orderMap = new HashMap<>();
        orderMap.put(new Product("Toothbrush red", 1.99), 1);
        orderMap.put(new Product("Toothbrush green", 1.99), 2);
        orderMap.put(new Product("Neighbours - card game", 20.01), 1);
        orderMap.put(new Product("Buckwheat 1 kg", 4.95), 3);

        return new OrderRequest(user, orderMap);
    }
}
